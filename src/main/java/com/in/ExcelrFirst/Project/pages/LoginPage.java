package com.in.ExcelrFirst.Project.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
	 WebDriver driver;
	 @FindBy(xpath = "//input[@id='user-name']")
	    public WebElement username;
	
	    @FindBy(xpath = "//input[@id='password']")
	    public WebElement password;
	    @FindBy(xpath = "//input[@id='login-button']")
	    public WebElement loginbtn;
	    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	    public WebElement threelinebtn;
	    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
	    public WebElement logoutbtn;
	    public LoginPage(WebDriver driver){
	        this.driver = driver; 
	        PageFactory.initElements(driver, this);
	    }
	    public void usernamedispay() {
	    	
	    	username.sendKeys("standard_user");
	       	
	    }
	    public void passworddispay() {
	    	password.sendKeys("secret_sauce");
	       
	    }
	    public void invalidpassworddispay() {
	    	password.sendKeys("secret_sauce1");
	       
	    }
	    public void clicklogin() {
	    	loginbtn.click();
	       
	    }
	    public void frameworkdatadriven() throws IOException {
	    	String filepath="C:\\Users\\mayuri\\OneDrive\\Desktop\\Book1.xlsx";
	    			FileInputStream fil=new FileInputStream(filepath);
	    			XSSFWorkbook workbook=new XSSFWorkbook(fil);
	    			XSSFSheet sheet=workbook.getSheet("Data");
	    			int rows=sheet.getLastRowNum();
	    			for(int r=1;r<=rows;r++) {
	    				XSSFRow row=sheet.getRow(r);
	    				XSSFCell userName=row.getCell(0);
	    				XSSFCell passwordName=row.getCell(1);
	    				try {
	    					username.clear();
	    					 
	    					username.sendKeys(userName.toString());
	    					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    			            WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(password));
    			            passwordField.clear();
    			            passwordField.sendKeys(passwordName.toString());
		    				loginbtn.click();
		    				threelinebtn.click();
		    				logoutbtn.click();
		    				System.out.println("Valid");
	    				}
	    				catch(Exception e) {
	    					System.out.println("Invalid Username or Password");
	    				}
	    				
	    			}
	    }
	  
}

package com.in.ExcelrFirst.Project;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.in.ExcelrFirst.Project.pages.LoginPage;
import com.in.ExcelrFrist.Project.Base.Base;

public class Login extends Base {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod()
    public void setup() {
        loadproperties();
        driver = browserlunch(prop.getProperty("browserName"));
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    }

    @Test
    public void loginWithvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.username.isDisplayed());
        loginPage.usernamedispay(); 
        Assert.assertTrue(loginPage.password.isDisplayed());
        loginPage.passworddispay(); 
        Assert.assertTrue(loginPage.loginbtn.isDisplayed());
        loginPage.clicklogin();
        WebElement Actualresult=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title']")));
        String Actualresults=Actualresult.getText();
        System.out.println(Actualresults);
        Assert.assertEquals("Products", Actualresults);
    }
    @Test
    public void loginWithInvalidusername() {
    	 LoginPage loginPage = new LoginPage(driver);
         Assert.assertTrue(loginPage.username.isDisplayed());
         loginPage.username.sendKeys("standard_user1");
         Assert.assertTrue(loginPage.password.isDisplayed());
         loginPage.password.sendKeys("secret_sauce"); 
         Assert.assertTrue(loginPage.loginbtn.isDisplayed());
         loginPage.clicklogin();
        String Expectedresult="Epic sadface: Username and password do not match any user in this service";
        WebElement Actualresults=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@data-test='error']")));
        String Actualresult=Actualresults.getText();
        System.out.println(Actualresult);
        Assert.assertEquals(Expectedresult, Actualresult);
    }
    @Test
    public void loginWithInvalidpasword() {
   	 LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.username.isDisplayed());
        loginPage.username.sendKeys("standard_user");
        Assert.assertTrue(loginPage.password.isDisplayed());
        loginPage.password.sendKeys("secret_sauce1"); 
        Assert.assertTrue(loginPage.loginbtn.isDisplayed());
        loginPage.clicklogin();
       String Expectedresult="Epic sadface: Username and password do not match any user in this service";
       WebElement Actualresults=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@data-test='error']")));
       String Actualresult=Actualresults.getText();
       System.out.println(Actualresult);
       Assert.assertEquals(Expectedresult, Actualresult);
   }
    @Test
    
    public void loginalluserwithdatadriven() throws IOException {
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage.frameworkdatadriven();
    }
    
    @AfterMethod
    public void closewindow() {
    	driver.close();
    }
}

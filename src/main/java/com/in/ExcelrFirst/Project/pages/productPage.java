package com.in.ExcelrFirst.Project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage {
	 WebDriver driver;
	 @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory ']")
	    public WebElement addtocart;
	 @FindBy(xpath = "//a[@class='shopping_cart_link']")
	    public WebElement cartbtnclick;
	 @FindBy(xpath = "//span[@class='shopping_cart_badge']")
	    public WebElement cartcount;
	 @FindBy(xpath = "//button[@class='btn btn_secondary btn_small btn_inventory ']")
	    public WebElement removeproduct;
	 @FindBy(xpath = "//span[@class='title']")
	    public WebElement cartlandingpage;
	 @FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")
	    public WebElement afetrlandingremovebtn;
	 @FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button ']")
	    public WebElement checkout;
	 @FindBy(xpath = "//button[@class='btn btn_secondary back btn_medium']")
	    public WebElement continueshoping;
	 @FindBy(xpath = "//button[@class='btn btn_secondary back btn_medium cart_cancel_link']")
	    public WebElement cancelbtn;
	 @FindBy(xpath = "(//input[@class='input_error form_input'])[1]")
	    public WebElement firstname;
	 @FindBy(xpath = "(//input[@class='input_error form_input'])[2]")
	    public WebElement lastname;
	 @FindBy(xpath = "(//input[@class='input_error form_input'])[3]")
	    public WebElement postalcode;
	 @FindBy(xpath = "//input[@class='submit-button btn btn_primary cart_button btn_action']")
	    public WebElement continuebtn;
	 @FindBy(xpath = "//button[@class='btn btn_action btn_medium cart_button']")
	    public WebElement finishbtn;
	 @FindBy(xpath = "//span[@class='title']")
	    public WebElement checkoutoverview;
	 @FindBy(xpath = "//h2[@class='complete-header']")
	    public WebElement checkoutfinishmsg;
	 @FindBy(xpath = "//button[@class='btn btn_primary btn_small']")
	    public WebElement backtohomebtn;
	 @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	    public WebElement threelinebtn;
	 @FindBy(xpath = "//a[@class='bm-item menu-item']")
	    public WebElement logoutbtn;
	public int itemCount;
	
	 public productPage(WebDriver driver){
	        this.driver = driver; 
	        PageFactory.initElements(driver, this);
	        this.itemCount = 0;
	    }
	 public void logoutbtn() {
		 logoutbtn.click();
	 }
	 public void threelinebtn() {
		 threelinebtn.click();
	 }
	 public void backtohomebtn() {
		 backtohomebtn.click();
	 }
	 public void finishbtn() {
		 finishbtn.click();
	 }
	 public void continuebtn() {
		 continuebtn.click();
	 }
	 public void cancelbtn() {
		 cancelbtn.click();
	 }
	 public void continueshoping() {
		 continueshoping.click();
	 }
	 public String cartlandingpage() {
		 return cartlandingpage.getText();
	 }
	 public String checkoutfinishmsg() {
		 return checkoutfinishmsg.getText();
	 } 
	 public String checkoutoverview() {
		 return checkoutoverview.getText();
	 }
	 
	 public void afetrlandingremovebtn() {
		 afetrlandingremovebtn.click();
	 }
	 public void firstname() {
		 firstname.sendKeys("Mayuri");
	 }
	 public void lastname() {
		 lastname.sendKeys("Nidebane");
	 }
	 
	 public void postalcode() {
		 postalcode.sendKeys("585401");
	 }
	 public void cartbtnclick() {
		 cartbtnclick.click();
	 }
	 public void checkout() {
		 checkout.click();
	 }
	 public void addItemToCart() {
	        addtocart.click();
	        itemCount++; 
	        System.out.println("Item added to cart. Total items in cart: " + itemCount);
	    }
	    public void addtocart() {
	    	
	    	addtocart.click();
	    	
	       		    }
	    public String cartcount() {
	    	return cartcount.getText();
	    }
	    public void removeproduct()
	    {
	    	removeproduct.click();
	    }
	    }

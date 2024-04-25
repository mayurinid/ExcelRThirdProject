package com.in.ExcelrFirst.Project;

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
import com.in.ExcelrFirst.Project.pages.productPage;
import com.in.ExcelrFrist.Project.Base.Base;

public class product extends Base {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod()
    public void setup() {
        loadproperties();
        driver = browserlunch(prop.getProperty("browserName"));
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    }

    @Test
    public void addproducttocart() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
    }
    @Test
    public void removeproducttocart() throws InterruptedException {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        Thread.sleep(3000);
        pp.removeproduct();
    }
    @Test
    public void afertaddproducttocartcountincrease() {
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
        productPage pp=new productPage(driver);
        pp.addItemToCart();
        pp.addItemToCart();
       int Actualvalue=  pp.itemCount;
       String ExpectedValue=pp.cartcount();
       Assert.assertEquals(String.valueOf(Actualvalue), ExpectedValue);
       
    }
    @Test
    public void cartpage() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
    }
    @Test
    public void cartpageproductremove() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
        pp.afetrlandingremovebtn();
    }
    @Test
    public void cartpagecontinue() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
    }
    @Test
    public void cartpagelandingchackout() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
     pp.checkout();
    }
    @Test
    public void cartproductcancel() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
     pp.checkout();
     pp.cancelbtn();
    }
    @Test
    public void chackoutinformation() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
     pp.checkout();
     pp.firstname();
     pp.lastname();
     pp.postalcode();
     pp.continuebtn();
     String actualcheckoutoverview=pp.checkoutoverview();
     String axpextedcheckoutoverview="Checkout: Overview";
     Assert.assertEquals(actualcheckoutoverview, axpextedcheckoutoverview);
     
    }
    @Test
    public void chackoutinformationcancel() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
     pp.checkout();
     pp.firstname();
     pp.lastname();
     pp.postalcode();
     pp.continuebtn();
     String actualcheckoutoverview=pp.checkoutoverview();
     String axpextedcheckoutoverview="Checkout: Overview";
     Assert.assertEquals(actualcheckoutoverview, axpextedcheckoutoverview);
     pp.cancelbtn();
    }
    @Test
    public void chackoutinformationfinish() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
     pp.checkout();
     pp.firstname();
     pp.lastname();
     pp.postalcode();
     pp.continuebtn();
     String actualcheckoutoverview=pp.checkoutoverview();
     String axpextedcheckoutoverview="Checkout: Overview";
     Assert.assertEquals(actualcheckoutoverview, axpextedcheckoutoverview);
     pp.finishbtn();
     String actualcheckoutfinishmsg=pp.checkoutfinishmsg();
     String axpextedcheckoutoverviewmsg="Thank you for your order!";
     Assert.assertEquals(actualcheckoutfinishmsg, axpextedcheckoutoverviewmsg);
     
     
    }
    @Test
    public void chackoutinforback() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
     pp.checkout();
     pp.firstname();
     pp.lastname();
     pp.postalcode();
     pp.continuebtn();
     String actualcheckoutoverview=pp.checkoutoverview();
     String axpextedcheckoutoverview="Checkout: Overview";
     Assert.assertEquals(actualcheckoutoverview, axpextedcheckoutoverview);
     pp.finishbtn();
     String actualcheckoutfinishmsg=pp.checkoutfinishmsg();
     String axpextedcheckoutoverviewmsg="Thank you for your order!";
     Assert.assertEquals(actualcheckoutfinishmsg, axpextedcheckoutoverviewmsg);
     pp.backtohomebtn();
     
    }
    @Test
    public void logout() {
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
        productPage pp=new productPage(driver);
        pp.addtocart();
        pp.cartbtnclick();
        String Actualcartlandingpage=pp.cartlandingpage();
        String Expectedcartlandingpage="Your Cart";
        Assert.assertEquals(Actualcartlandingpage, Expectedcartlandingpage);
     pp.continueshoping();
     pp.addtocart();
     pp.cartbtnclick();
     pp.checkout();
     pp.firstname();
     pp.lastname();
     pp.postalcode();
     pp.continuebtn();
     String actualcheckoutoverview=pp.checkoutoverview();
     String axpextedcheckoutoverview="Checkout: Overview";
     Assert.assertEquals(actualcheckoutoverview, axpextedcheckoutoverview);
     pp.finishbtn();
     String actualcheckoutfinishmsg=pp.checkoutfinishmsg();
     String axpextedcheckoutoverviewmsg="Thank you for your order!";
     Assert.assertEquals(actualcheckoutfinishmsg, axpextedcheckoutoverviewmsg);
     pp.backtohomebtn();
     pp.threelinebtn();
     pp.logoutbtn();
         }
    @AfterMethod
    public void tear() {
    	driver.quit();
    }
}

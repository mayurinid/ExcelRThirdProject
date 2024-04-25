package com.in.ExcelrFrist.Project.Base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public Properties prop;
	WebDriver driver;
	WebDriverWait wait;

	public void loadproperties() {
		prop=new Properties();
		File propfile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\in\\ExcelrFirst\\Project\\properties\\config.properties");
		try{
			FileInputStream fis=new FileInputStream(propfile);
			prop.load(fis);
		}
		catch(Throwable e) {
		e.printStackTrace();
		}
		
		
		
	}
	public WebDriver browserlunch(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Provide Valid Browsername");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();	
		driver.get(prop.getProperty("url"));
		
		return driver;
	}


}

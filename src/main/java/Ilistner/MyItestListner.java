package Ilistner;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class MyItestListner implements ITestListener {
	ExtentReports extent;
	WebDriver driver;
	ExtentTest extentTest;
	
	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();	
		System.out.println(testname+"Start Executing..");	
	}  

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname=result.getName();	
		System.out.println(testname+"got sucessfully excuted");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"got failed");	
		System.out.println(result.getThrowable());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();	
	    System.out.println(testname+"got skipped");	
	System.out.println(result.getThrowable());
	}

		@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished Executing Project");
	}

}

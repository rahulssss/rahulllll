package testsuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class xtentreportgeneration {

	@Test
	public void xtenttest() throws IOException
	{
		
		
		ExtentReports report=new ExtentReports("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\reports\\rr.html",true);
		ExtentTest test=report.startTest("rhuuulll");
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO, "launch the browser");
		driver.get("http://google.com");
	test.log(LogStatus.INFO, "goole open");
	driver.findElement(By.linkText("Gmail")).click();
	test.log(LogStatus.INFO, "gmail opn");
	File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(scrFile, new File("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\screenshot\\my.png"));
	test.addScreenCapture("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\screenshot\\my.png");
	report.endTest(test);
	report.flush();
	
	}
	}

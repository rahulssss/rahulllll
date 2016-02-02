package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class keyworddrivenlogin {
	FirefoxDriver driver;
	@BeforeMethod
	public void test()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
	}
@Test
public void Tset() throws IOException
{
	FileInputStream f=new FileInputStream("D:\\selenium rahul\\myselenium\\orangeHrm.properties");
Properties pr=new Properties();
pr.load(f);
driver.findElement(By.id(pr.getProperty("Username"))).sendKeys("Admin");
driver.findElement(By.id(pr.getProperty("Password"))).sendKeys("admin");
driver.findElement(By.id(pr.getProperty("LOGIN"))).click();

}
}

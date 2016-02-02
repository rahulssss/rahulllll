package frameKeyworddrn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginusingproperties {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		
}
	@Test
public void logintestorangehrm() throws IOException
{
		FileInputStream f=new FileInputStream("D:\\selenium rahul\\myselenium\\keyword.properties");
         Properties pr=new Properties();
         pr.load(f);
         driver.findElement(By.id(pr.getProperty("useName"))).sendKeys("Admin");
         driver.findElement(By.id(pr.getProperty("passWord"))).sendKeys("admin");
         driver.findElement(By.id(pr.getProperty("login"))).click();
}
}


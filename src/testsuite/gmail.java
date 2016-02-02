package testsuite;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmail {
	@Test
	public void gmailTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}


}

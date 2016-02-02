package testsuite;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class google {
	@Test
	public void googleTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
	}

}

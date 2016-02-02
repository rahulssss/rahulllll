package addaaaaall;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class google {
	@Test
	public void test()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}

package addaaaaall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linksaaAndimages {
public static void main(String[] args)
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://yahoo.com");
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println(links.size());

links.addAll(driver.findElements(By.tagName("img")));

}
}

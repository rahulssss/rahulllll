package frameworkDatadrvnTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ajaxtestng {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://care.ideacellular.com");
		
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\excelfiles\\Ajaxdata.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("sheet1");
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
		Row r=row.next();
		String phnno=r.getCell(0).getStringCellValue();
	driver.findElement(By.name("mobileNumber")).clear();
	driver.findElement(By.name("mobileNumber")).sendKeys(phnno);
	driver.findElement(By.name("amountPaid")).click();
	WebElement ajax=driver.findElement(By.xpath("ajaxXpath"));
	
	String actajax=null;
	if(ajax.getText().isEmpty())
	{
		actajax="No ajax";
	}
	else
	{
		actajax=ajax.getText();
		
	}
	r.createCell(2).setCellValue(actajax);
	String expajax=r.getCell(1).getStringCellValue();
	if(actajax.equals(expajax))
	{
		r.createCell(3).setCellValue("passed");
		
	}
	else
	{
		r.createCell(3).setCellValue("failed");
	}
	}
	FileOutputStream f1=new FileOutputStream("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\resultexcelfile\\ajxactl.xlsx");
wb.write(f1);

f1.close();
}
}	
	
	
	
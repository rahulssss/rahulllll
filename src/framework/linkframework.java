package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class linkframework {
	FirefoxDriver driver;
	@BeforeMethod
	public void trst()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\excelfiles\\excellinkss.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
	Row r=row.next();
	
	String linkname=r.getCell(0).getStringCellValue();
	try
	{
	driver.findElement(By.linkText(linkname)).click();
String acturl=driver.getCurrentUrl();
r.createCell(2).setCellValue(acturl);
String exp=r.getCell(1).getStringCellValue();
	if(acturl.equals(exp))
	{
		r.createCell(3).setCellValue("passed");
	}
	else
	{
		r.createCell(3).setCellValue("failed");
	}
	
	driver.navigate().back();
	}
	catch(Exception e)
	{
	r.createCell(3).setCellValue("not found");
	}

	}
	FileOutputStream f1=new FileOutputStream("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\resultexcelfile\\rahulnew.xlsx");	
	wb.write(f1);
	f1.close();
	
	
	
	}
}
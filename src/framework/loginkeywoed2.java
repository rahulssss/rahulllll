package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class loginkeywoed2 {
@Test
public void Login() throws IOException
{
	keyword2 keys=new keyword2();
	FileInputStream f=new FileInputStream("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\excelfiles\\LoginKeywords.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("sheet1");
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
	Row	r=row.next();
String actoin=r.getCell(3).getStringCellValue();
	if(actoin.equals("launchBrowser"))
	{
		keys.launchBrowser();
	}
	else if(actoin.equals("navigate"))
	{
		keys.navigate();
	}
	
	else if(actoin.equals("enterUsername"))
	{
		keys.enterUsername();
	}
	else if(actoin.equals("enterPassword"))
	{
		keys.enterPassword();
	}
	
	else if(actoin.equals("clickLogin"))
	{
		keys.clickLogin();
	}
	
	
	}
}
}

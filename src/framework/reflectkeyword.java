package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class reflectkeyword {
	keyword2 keys=new keyword2();
	Method[] method=keys.getClass().getMethods();
	@Test
	public void reflectionlogintest() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		FileInputStream f=new FileInputStream("D:\\selenium rahul\\myselenium\\src\\com\\rahul\\excelfiles\\LoginKeywords.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("sheet1");
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
	Row	r=row.next();
	String action=r.getCell(3).getStringCellValue();
	excuteAction(action);
	}
	}
	public void excuteAction(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
	for(int i=0;i<method.length;i++)
	{
	if(action.equals(method[i].getName()))
	{
		method[i].invoke(keys);
		break;
		
	}
	}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
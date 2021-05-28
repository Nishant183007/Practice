package TestNgNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import cucumber.deps.com.thoughtworks.xstream.converters.reflection.XStream12FieldKeySorter;
public class ExcelReadOperations {

	public static void main(String[] args) throws IOException {
//not working
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Selenium\\Selenium Maven\\TestNg\\target\\Inputs\\ExcelRead.xls");
		Workbook w=new HSSFWorkbook(fis);
		
		int c=w.getSheet("Practice").getLastRowNum();
		System.out.println(c);
		
	}

}

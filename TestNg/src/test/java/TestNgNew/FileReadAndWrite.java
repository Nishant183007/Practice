package TestNgNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException {
//Read values from File
		FileInputStream fis= new  FileInputStream("C:\\Users\\HP\\Selenium\\Selenium Maven\\TestNg\\test-output\\Nishant.txt");
		Properties p=new Properties();
		p.load(fis);
		p.getProperty("browser");
		
		
		
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		String strDate = dateFormat.format(date);  
		System.out.println(strDate);
		
		String s=strDate.replace(":", "-");
		System.out.println(s);
		
		FileOutputStream fos= new FileOutputStream(System.getProperty("user.dir")+"\\test-output\\OutputNishant "+s+".txt");
		Properties pp=new Properties();
		pp.put("Name", "Nishant");
		
		pp.store(fos,"Comment");
		
		
		System.out.println(System.getProperty("user.dir"));
	}

}

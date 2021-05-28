package TestNgNew;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\HP\\Selenium\\Selenium Maven\\TestNg\\test-output\\Nishant.txt");
		if(file.createNewFile())
		{
			System.out.println("File Created!!!");
			System.out.println(file.getAbsolutePath());
			FileWriter fw= new FileWriter("C:\\Users\\HP\\Selenium\\Selenium Maven\\TestNg\\test-output\\Nishant.txt");
			fw.write("Inserted data into file 1\n");
			fw.write("Inserted data into file 2\n");
			fw.write("Inserted data into file 3\n");
			fw.close();
		}
		else
		{
			file.delete();
			System.out.println("Deleted Successfully!!!!!!!");
		}
		
Scanner s = new Scanner(file);
while(s.hasNext())
{
	System.out.println(s.nextLine());
}
}
		
	

}

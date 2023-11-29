package testpkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandlingclass 
{
	public static void writedata() throws Exception
	{
		File f = new File("./abc.txt/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nthis is fourth line");
		fw.flush();
		fw.close();
	}
	
	public static void readprop() throws Exception
	{
		//File f = new File("./abc.txt/test.properties");
		FileReader fr = new FileReader("./abc.txt/test.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("name"));
		System.out.println(prop.get("url"));
	}

	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\manvi\\OneDrive\\Desktop\\test.txt")
		File f = new File("./abc.txt/abc.txt2");
		
		FileReader fr = new FileReader(f);
		int r = fr.read();
		//System.out.print((char)r);
		//System.out.print((char)r);
		while (r!=-1)
		{
			System.out.print((char)r);
			r=fr.read();
		}
		
		//System.out.println(fr.read(char));
		//System.out.println(fr.read());
		//System.out.println(fr.read());
		//System.out.println(fr.read());
	}
	public static void main(String[]args) throws Exception
	{
		//FileHandlingclass.readdata();
		
		//FileHandlingclass.writedata();
		FileHandlingclass.readprop();
		
	}
	
	
	
	
	
}







package vijaysatrathi.HotelManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader 
{
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ELCOT\\Desktop\\vijay\\resume.doc");
		FileReader reader=new FileReader(file);
		int hai=0;
		while((hai=reader.read())!=-1)
		{
		System.out.println((char)hai);	
		}
	}

}

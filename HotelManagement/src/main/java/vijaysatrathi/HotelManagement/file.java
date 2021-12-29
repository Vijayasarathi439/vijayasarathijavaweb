package vijaysatrathi.HotelManagement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file 
{

	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\ELCOT\\Desktop\\vijay\\hjghg.doc");
		FileOutputStream vj=new FileOutputStream(file);
		FileWriter wr=new FileWriter(file);
		wr.write("bceihcmkllknclkncklnljbclnkndlkdkjbdkjjbk");
		vj.close();
		wr.close();
	
	}

}
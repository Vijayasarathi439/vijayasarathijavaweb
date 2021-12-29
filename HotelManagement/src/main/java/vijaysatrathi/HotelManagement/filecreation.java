package vijaysatrathi.HotelManagement;

import java.io.File;
import java.io.IOException;

public class filecreation {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\ELCOT\\Desktop\\vijay\\resume.doc");
	file.createNewFile();
	System.out.println(file.getAbsolutePath()+"has created");
}
}

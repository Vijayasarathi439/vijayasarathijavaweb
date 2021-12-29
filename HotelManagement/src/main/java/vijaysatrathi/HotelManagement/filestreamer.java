package vijaysatrathi.HotelManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class filestreamer 
{
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ELCOT\\Desktop\\vijay\\name.zip");
		FileInputStream dis= new FileInputStream(file);
		InflaterInputStream vis=new InflaterInputStream(dis);
		byte[]venom=new byte[dis.available()];
		vis.read();
		dis.close();
		System.out.println(file.getName()+"has follwoing convert:\n"+new String(venom));
		
	}

}

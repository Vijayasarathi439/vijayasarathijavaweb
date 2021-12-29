package vijaysatrathi.HotelManagement;

import java.io.File;
import java.io.IOException;

public class newpackage 
{
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ELCOT\\Desktop\\vijay\\java\\vel.txt");
		boolean present=file.exists();
		System.out.println("file presenr:"+present);
		if(present==false)
		{
			boolean created=file.createNewFile();
					{
				System.out.println("file created:"+created);
					}
			
		}
		
		
	}

}

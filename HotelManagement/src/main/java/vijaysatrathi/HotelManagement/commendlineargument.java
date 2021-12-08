package vijaysatrathi.HotelManagement;
import java.util.Scanner;

public class commendlineargument {
	public static void main(String[] args) {
		String[] hlo={"4a","6b"};
		System.out.println(hlo.length);
		Scanner yets=new Scanner(System.in);
		int ram=0,news=0;
		try
		{
			ram=Integer.parseUnsignedInt(hlo[0]);
			news=Integer.parseUnsignedInt(hlo[1]);
			System.out.println(ram+""+news);
			System.out.println(ram/news);
			
		}
		catch(NumberFormatException er)
		{
			System.out.println(er+"\n enter onl;y numbericals");
			ram=yets.nextInt();
			news=yets.nextInt();
			System.out.println(ram+""+news);
			System.out.println(ram/news);
			
		}
		
		
		
		
		
		
		
		
		
	}

}

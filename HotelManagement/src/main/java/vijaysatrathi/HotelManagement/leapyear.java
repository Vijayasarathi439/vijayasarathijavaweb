package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class leapyear{
	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		year=s.nextInt();
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		{
			System.out.println("leap year");
				
	}
		else
		{
			System.out.println("not leapyear");
		}
		
		
		
		
		
		
		
		
		
		
	}

}

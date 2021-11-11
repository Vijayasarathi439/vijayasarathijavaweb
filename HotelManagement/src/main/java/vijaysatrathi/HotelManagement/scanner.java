package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter any year:");
		int year=s.nextInt();
		boolean flag=false;
		if(year % 400==0)
		{
		flag=true;
		}
		else if(year % 100 == 0);
		 {
			 flag=false;
		 }
		 if(year %4 ==0)
		 {
		 flag=true;
		 }
		 else
		 {
			 flag=false;
		 }
		 System.out.println("enter the leap year");
		 System.out.println("ënter the not leap year");
		 }
		 
			 
		 
		
		
		
		
		
		
		
		
		
	}
}

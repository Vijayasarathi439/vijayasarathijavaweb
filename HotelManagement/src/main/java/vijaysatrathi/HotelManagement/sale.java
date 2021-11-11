package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class sale {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String collection="";
		for( int mob=1;mob<=5;mob++)
		{
			for( int time=1;time<=20;time++)
			{
				System.out.println("enter the amount:");
				int amount=s.nextInt();
				if(amount==16999)
				{
					System.out.println("mobile was booked");
				}
				else
				{
					System.out.println("mobile not booked");
				}
				collection+="/n";
				
				int amount1=s.nextInt();
				if(mob==2)
				{
				System.out.println("enter the coolection of mobile price"+"mobile"+"x"+"price");
				}
				
				
			
			
			
			}
				
		}
	}
		
		
}
			
			
		
		
		
		
		
		
		
	

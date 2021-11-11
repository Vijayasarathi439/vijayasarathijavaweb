package vijaysatrathi.HotelManagement;
import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		int num;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		num=s.nextInt();
		for(int i=2;i<=2;i++)
		{
			if(num%2==0)
			{
				flag=true;
				break;
			}
			if(!flag)
			{
				System.out.println(num+"is prime number");
			}
			else
			{
				System.out.println(num+"is n ot prime number");
			}
		}
		
		
		
	}
}
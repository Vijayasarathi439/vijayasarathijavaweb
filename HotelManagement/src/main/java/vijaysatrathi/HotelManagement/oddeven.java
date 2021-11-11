package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class oddeven {
	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}

}

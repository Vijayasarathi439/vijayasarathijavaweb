package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		int i,fact=1;
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
number=s.nextInt();
for(i=1;i<=number;i++)
{
	fact=fact*i;
}

System.out.println("factorial number is"+fact)	;
	}
}



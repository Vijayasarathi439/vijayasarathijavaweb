package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class busticket {
public static void main(String[] args) {
String chart="";
Scanner scan=new Scanner(System.in);
for(int row=1;row<=10;row++)
{
	for(int seat=1;seat<=4;seat++)
	{
		System.out.println("enter teh amount:");
	int amount=scan.nextInt();
		if(amount>=240)
		{
			System.out.println("seat booked"+"@"+"row"+"seat");
			chart+="$";
		}
		else
		{
			System.out.println("insuffient amount to book seat");
			chart+="@";
		}
		if(seat==2)
		chart+="";
}
chart+="/n";
System.out.println("prepered chat is:"+chart);
	
	
	
	
	
}
}
}
package vijaysatrathi.HotelManagement;
import java.util.InputMismatchException;
import java.util.Scanner;
public class multicatchexcrptions {
	public static void bubble (int[]yet)
	{
		for(int index=0;index<yet.length-1;index++)
		{
		for(int pos=0;pos<yet.length- index-1;pos++)
		{
			if(yet[pos]>yet[pos+1]);
			{
			yet[pos+1]^=yet[pos];
			yet[pos]^=yet[pos+1];
			yet[pos+1]^=yet[pos];
					
		}	
		}
		}
		}
	public static void selection(int[]say)
	{
		for(int hold=0;hold<say.length;hold++)
		{
			for(int com=hold+1;com<say.length;com++)
			{
				if(say[hold]>say[com])
				{
					say[com]^=say[hold];
					say[hold]^=say[com];
					say[com]^=say[hold];
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[]rating= {0,2,3,4,5,6,7,8,9,};
		double current=0.0,increment=0;int pos=0;
		try
		{
			System.out.println("tell about our salary");
			current=scan.nextDouble();
			System.out.println("select ratings");
			increment=scan.nextInt();
			increment=(current*rating[pos])/100;
			increment+=current;
			System.out.println(current+"update salary");
			
		}
catch(InputMismatchException ar)
		{
	Scanner scans=new Scanner(System.in);
	System.out.println(ar+"\n enter only numerices");
	System.out.println("tell about our salary");
	current=scans.nextDouble();
	System.out.println("select ratings");
	increment=scans.nextInt();
	increment=(current*rating[pos])/100;
	increment+=current;
	System.out.println(current+"update salary");
		}
	catch(Exception er)
	{
		System.out.println(er);
	}
		finally
		{
			System.out.println("happy for good hike");
		}
	
}	
}
		
		
		
		
		
		
	
		
		
		
		
		
	
	

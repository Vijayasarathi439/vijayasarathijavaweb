package vijaysatrathi.HotelManagement;
import java.util.Arrays;
import java.util.Scanner;

public class demosorting {
	public static void  bubble(int[]yet)
	{
		for(int index=0;index<yet.length-1;index++)
		{
			for(int pos=0;pos<yet.length-index-1;pos++)
			{
				if(yet[pos]>yet[pos+1])
				{
					yet[pos+1]^=yet[pos];
					yet[pos]^=yet[pos+1];
					yet[pos+1]^=yet[pos];
					
				}
				
			}
		}
		
	}
	public static void selection(int[]yets)
	{
		for(int hold=0;hold<yets.length;hold++)
		{
			for(int com=hold+1;com<yets.length;com++)
			{
				if(yets[hold]>yets[com])
				{
					yets[com]^=yets[hold];
					yets[hold]^=yets[com];
					yets[com]^=yets[hold];
				}
			}
		}
	}
	public static void main(String[] args) {
	Scanner scans=new Scanner(System.in);
	int[] items= {13,45,87,54,98,56,89,55,89,23};
	try
	{
		System.out.println("tell as sorting algorithm");
		String alg=scans.next();
		if(alg.equalsIgnoreCase("bubble"))
		{
			demosorting.selection(items);
			System.out.println(Arrays.toString(items));
		}
		else if(alg.equalsIgnoreCase("selection"))
		{
			demosorting.selection(items);
			System.out.println(Arrays.toString(items));
			
		}
		else
		{
			throw  new sortingexception();
			
		}
		
	}
	catch(sortingexception er)
	{
		System.out.println(er);
		demosorting.main(args);
	}
	finally
	{
		scans.close();
	}
	
	}
}

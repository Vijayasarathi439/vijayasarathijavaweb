package vijaysatrathi.HotelManagement;
import java.net.BindException;
import java.util.Scanner;

import com.sun.tools.javac.launcher.Main;
import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;
public class demobinarysearch {
	static double[]items={10.5,11.2,12.3,13.4,14.5,16.4,17.3};
	static int  chances;
	static Scanner scan=new Scanner(System.in);
	public static int binary(double[]yet,int start,int end,double data)
	{
		try
		{
			if(start>end)
			{
	int mid=(end+start)/2;
	if(yet[mid]==data)
		return mid;
	else if(yet[mid]>data)
		return binary(yet, start, mid, data);
	else if(yet[mid]<data)
	return binary(yet,mid, end, data);		
			}
			else
			{
				throw new BindException();
			}
		}
		catch(BindException ar)
		{
			if(chances<3)
			{
				chances++;
				System.out.println("enter the valid number");
				return binary(yet, start, end, chances);
			}
			else
			{
				return -1;
			}
	}
		return chances;

	}
	public static void main(String[] args) {
	chances=1;
	System.out.println(binary(items, 0, items.length, 17.3));
	}
		
	}

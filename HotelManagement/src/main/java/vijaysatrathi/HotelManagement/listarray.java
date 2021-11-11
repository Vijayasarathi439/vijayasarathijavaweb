package vijaysatrathi.HotelManagement;
import java.util.Arrays;
import java.util.Scanner;
public class listarray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double[] tv=new double[5];
		for(double index=0;index<tv.length;index++)
		{
			System.out.println("set the tv value:"+index);
			tv[(int) index]=scan.nextDouble();
		}
		//
		for(double point=0;point<tv.length;point++)
		{
			System.out.println(tv[(int)point]);
		}
		for(double tmp:tv)
		{
			System.out.println(tmp);
		}
		//
		System.out.println(Arrays.toString(tv));
		
		
		
		
		
	}

}

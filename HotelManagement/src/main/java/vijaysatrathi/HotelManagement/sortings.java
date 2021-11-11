package vijaysatrathi.HotelManagement;

import java.util.Arrays;

public class sortings {
	public void bubble(int[]hey)
	{
		for(int time=0;time<hey.length-1;time++)
		{
			for(int point=0;point<hey.length-time-1;point++)
			{
				if(hey[point]>hey[point+1])
				{
					hey[point]+=hey[point+1];
					hey[point+1]=hey[point]-hey[point+1];
					hey[point]-=hey[point+1];
				}
			}
		}
	}
	public static void main(String[] args) {
		sortings sort=new sortings();
	int[] say= {45,81,98,67,98,90,63,87,98,65};
	System.out.println(Arrays.toString(say));
	sort.bubble(say);
System.out.println("after bubble\n"+Arrays.toString(say));
	}
	}

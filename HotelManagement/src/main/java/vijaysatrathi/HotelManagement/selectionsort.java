package vijaysatrathi.HotelManagement;

import java.util.Arrays;

public class selectionsort {
	public void selection(int[]hai)
	{
		for(int sel=0;sel<hai.length;sel++)
		{
			for(int com=0;com<hai.length;com++)
			{
				if(hai[sel]>hai[com])
				{
					hai[sel]^=hai[com];
					hai[com]^=hai[sel];
					hai[sel]^=hai[com];
				}
			}
		}
	}
public static void main(String[] args) {
	selectionsort s=new selectionsort();
	int[]say= {45,76,98,78,90,45,86,34};
	System.out.println(Arrays.toString(say));
	s.selection(say);
	System.out.println("after bubble/n"+Arrays.toString(say));
}
}
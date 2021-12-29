package vijaysatrathi.HotelManagement;

import java.util.Arrays;

public class bubble {
	public void selection(int[]yet)
	{
		for(int i=0;i<yet.length;i++)
		{
			for(int j=0;j<yet.length;j++)
			{
				if(yet[i]<yet[j])
			{
				yet[i]^=yet[j];
					yet[j]^=yet[i];
					yet[i]^=yet[j];
}
				
			}
		}
	
		
	}
	public static void main(String[] args) {
		selectionsort sort=new selectionsort();
		int[]am= {99,2,100,30,72,55,10};
		System.out.println(Arrays.toString(am));
		sort.selection(am);
		System.out.println("after selection\n"+Arrays.toString(am));
	}

}

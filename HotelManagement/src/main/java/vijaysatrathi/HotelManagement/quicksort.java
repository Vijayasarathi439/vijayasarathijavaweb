package vijaysatrathi.HotelManagement;

import java.util.Arrays;

public class quicksort {
	public int sortquick(int[] each,int start,int end)
	{
		int pivotaldata=each[end];
		int pos=start-1;
		for(int index=start;index<end;index++)
		{
			if(each[index]<pivotaldata)
			{
				pos++;
				int third=each[pos];
				each[pos]=each[index];
				each[index]=third;
			}
				
		}
		int third=each[pos+1];
		each[pos+1]=each[end];
		each[end]=third;
		return pos+1;
	}


public void quick(int[] say,int start,int end)
{
	if(start<end)
	{
		int pivotal=sortquick(say,start,end);
quick(say,start,pivotal-1);
quick(say,pivotal+1,end);
	}
}
public static void main(String[] args) {
	quicksort sort=new quicksort();
	int[]say= {43,98,78,19,65,34};
	System.out.println(Arrays.toString(say));
	sort.quick(say, 0, say.length-1);
	System.out.println("after bubble/n"+Arrays.toString(say));
}
}

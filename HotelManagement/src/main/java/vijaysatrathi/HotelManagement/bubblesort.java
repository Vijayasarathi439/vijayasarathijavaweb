package vijaysatrathi.HotelManagement;

public class bubblesort
{
	public static void main(String[] args) {
		int[]arr= {30,20,76,80,78,56};
		int j=3;
		while(j<arr.length)
		{
			int i=0;
			while(i<arr.length-j)
			{
			if(arr[i]>arr[i+1])
					{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
					}
			i++;
		}
			j++;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
			
	}

	}

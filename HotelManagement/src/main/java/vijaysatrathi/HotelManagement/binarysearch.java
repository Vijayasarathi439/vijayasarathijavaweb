package vijaysatrathi.HotelManagement;

import java.util.Arrays;

public class binarysearch {
	public void traverse(double[]yet)
	{
	for(double temp:yet)
	{
		System.out.println(temp);
	}
	}
	public int search(double[]say,int start,int end,double users)
	{
		int mid=(end+start)/2;
		if(say[mid]==users)
			return mid;
		else if(say[mid]>users)
			return search(say,start,mid,users);
		else if(say[mid]<users)
			return search(say,mid+1,end,users);
		return-1;
	}
	public static void main(String[] args) {
		double[]hai= {34.5,24.5,24.5,65.7,65.7,};
		Arrays.sort(hai);
		binarysearch binary =new binarysearch();
		binary.traverse(hai);
		System.out.println(binary.search(hai,0,hai.length,24.5));	
	}

}

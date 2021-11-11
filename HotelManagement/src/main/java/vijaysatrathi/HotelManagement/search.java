package vijaysatrathi.HotelManagement;

import java.util.Arrays;

public class search{
public void middlepoint(double[]yet)
{
	for(double temp:yet)
	{
		System.out.println(yet);
	}
}
public int type(double[]say,int start,int end,double user)
{
	int mid=(end+start)/2;
	if( say[mid]==user)
		return mid;
	if(say[mid]>user)
		return type(say,start,mid,user);
	if(say[mid]<user)
		return type(say,mid+1,end,user);
	return-1;
}
	
	
	
	
	
	
	
	
	
	


	public static void main(String[] args) {
		double[]call= {10.2,12.4,13.5,65.8,98.5,87.9,87.0};
		Arrays.sort(call);
		search search=new search();
		search.middlepoint(call);
		System.out.println(search.type(call,0,call.length,65.8));
		
		
	}
		
		
	}


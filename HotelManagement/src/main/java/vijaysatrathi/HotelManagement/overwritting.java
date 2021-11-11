package vijaysatrathi.HotelManagement;

public class overwritting {
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum1(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		overwritting s=new overwritting();
		System.out.println(s.sum(56, 876));
		System.out.println(s.sum(78, 98));
		
	}

}

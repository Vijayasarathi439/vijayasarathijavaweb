package vijaysatrathi.HotelManagement;

public class variables 
{
	int d=30;  // Global or instance variable  
	static int b=7;   // static variable
	public void a()
	{
		int a=50;     // Local variable 
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		int c=89;
		System.out.println(c);
		System.out.println(b);
		variables a = new variables();
		a.a();
	
	}
	
}

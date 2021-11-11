package vijaysatrathi.HotelManagement;

public class school {
	int rollnumber;
	String name;
	String address;
	public  school(int r,String s,String a)
	{
		rollnumber=r;
		name=s;
		address=a;
		
	System.out.println("srv");
	}
	void display()
	{
		System.out.println(rollnumber+""+name+""+address);
	}
	public static void main(String[] args)
	{
	school s=new school(161,"vijayasarathi","salem");
	school s1=new school(162,"manoj","chennai");
	s.display();
	s1.display();
	
	}

}

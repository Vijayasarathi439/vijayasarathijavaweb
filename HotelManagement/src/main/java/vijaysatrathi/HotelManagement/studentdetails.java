package vijaysatrathi.HotelManagement;

public class studentdetails {
	int rollnumber;
	String name;
	static String college="kavery";
	studentdetails(int r,String s)
	{
		rollnumber=r;
		name=s;
	}
	void display()
	{
		System.out.println("enter the name:"+name);
		System.out.println("enter the rollnumber:"+rollnumber);
		System.out.println("enter the college name:"+college);
	}
	public static void main(String[] args) {
		studentdetails s=new studentdetails(161,"viajyasarathi");
		studentdetails s1=new studentdetails(162,"manojkumar");
		s.display();
		s1.display();
	}

}

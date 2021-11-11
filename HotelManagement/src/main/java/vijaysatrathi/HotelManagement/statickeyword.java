package vijaysatrathi.HotelManagement;

public class statickeyword {
int rollnumber;
String name;
static String college="sona";
statickeyword(int r,String s)
{
rollnumber=r;
name=s;
}
void display()
{
	System.out.println("enter the rollnumber:"+rollnumber);
	System.out.println("enter the name:"+name);
	System.out.println("enter the college name:"+college);
}
public static void main(String[] args) {
	statickeyword s=new statickeyword(161,"viajyasarathi");
	statickeyword s1=new statickeyword(162,"manojkumar");
	s.display();
	s1.display();
}
}
	



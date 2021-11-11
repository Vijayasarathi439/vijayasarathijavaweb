package vijaysatrathi.HotelManagement;

public class medicalproducts {
	int priceno;
	String productname;
	static String officename= "pskpharmacy";
	medicalproducts(int r,String s)
	{
		priceno=r;
		productname=s;
	}
void display()
{
	System.out.println(priceno+""+productname+""+officename);
}
public static void main(String[] args) {
	medicalproducts s=new medicalproducts(450,"luliconsolecream");
	medicalproducts s2=new medicalproducts(650,"cipla250");
	s.display();
	s2.display();
}
}
 x
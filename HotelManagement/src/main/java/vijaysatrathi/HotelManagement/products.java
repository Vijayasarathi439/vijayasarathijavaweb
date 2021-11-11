package vijaysatrathi.HotelManagement;

public class products {
	int price;
	String productname;
	static  String companyname ="manisupermarket";
	products(int r,String s)
	{
		price=r;
		productname=s;
		
	}
	void display()
	{
		System.out.println(price+""+productname+""+companyname);
	}
public static void main(String[] args) {
	products s=new products(150,"sakthimasela");
	products s1=new products(200,"teapowder");
	products s2=new products(300,"coffeepowder");
	s.display();
	s1.display();
	s2.display();
}
}

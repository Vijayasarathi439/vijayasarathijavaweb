package vijaysatrathi.HotelManagement;

public class construct {
	String collegename;
	public construct(String collegename) 
	{
		this.collegename="ksr arts and science";
		
	}
	public static void main(String[] args) {
		construct s=new construct("ksr");
		System.out.println(s.collegename);
	}

}

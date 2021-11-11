package vijaysatrathi.HotelManagement;

public class fibanaci {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,r,value=20;
		System.out.println(n1+""+n2);
		for(r=1;r<value;++r)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(""+n3);
			
			}
		}
	}



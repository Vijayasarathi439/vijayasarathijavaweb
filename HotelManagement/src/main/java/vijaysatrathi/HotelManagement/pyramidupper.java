package vijaysatrathi.HotelManagement;

public class pyramidupper {
	public static void main(String[] args) {
		char num='a',limited=1;
		for(int row=5;row<0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print("");
			}
			for(int col=1;col<=limited;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
			limited-=2;
		}
		
		
		
		
	}

}

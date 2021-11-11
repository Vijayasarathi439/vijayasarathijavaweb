package vijaysatrathi.HotelManagement;

public class rightupperfloyed {
	public static void main(String[] args) {
		char num='A';
		for(int row=1;row<=5;row++)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print("");
			}
			for(int col=1;col<=row;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

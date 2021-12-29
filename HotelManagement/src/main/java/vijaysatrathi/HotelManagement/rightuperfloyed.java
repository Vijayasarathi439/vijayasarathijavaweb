package vijaysatrathi.HotelManagement;

public class rightuperfloyed 
{
	public static void main(String[] args) {
		char num='A';int limit=(5*2)-1;
		for(int row=5;row>0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
			limit-=2;
		}
		}
	}





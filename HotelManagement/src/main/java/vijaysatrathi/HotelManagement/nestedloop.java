package vijaysatrathi.HotelManagement;

public class nestedloop {
	public static void main(String[] args) {
		for(int table=1;table<=15;table++)
		{
			System.out.println("tab"+table+" willget started");
			if(table==10)
			break;
		for(int num=1;num<=10;num++)
		{
			System.out.println(num+"x"+table+"="+(table*num));
		}
		
		
		
	}
	}
}

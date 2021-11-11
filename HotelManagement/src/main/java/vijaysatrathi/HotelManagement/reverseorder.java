package vijaysatrathi.HotelManagement;
public class reverseorder {
	public static void main(String[] args) {
		int number=1234,reverse=0;
		for(number= 0;reverse<=4;++reverse)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("the reverse of the given number:"+reverse);
	}

}












































































































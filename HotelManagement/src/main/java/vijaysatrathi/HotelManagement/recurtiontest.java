package vijaysatrathi.HotelManagement;

public class recurtiontest {
	public void heythere(int data)
	{
		if(data<13)
		{
			System.out.println("function get called:"+data);
			data++;
			heythere(data);
		}
		return;
	}
	public static void main(String[] args) {
		recurtiontest test=new recurtiontest();
		test.heythere(5);
	}

}

package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class laxhmitheater {
	public static void main(String[] args) {
		theater booking=new theater();
		Thread t1=new Thread(booking,"vijay");
		Thread t2=new Thread(booking,"rajan");
		Thread t3=new Thread(booking,"kumar");
		Thread t4=new Thread(booking,"gokul");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
class theater implements Runnable
{
	int sets=75,fare=120,usercount,useramount;
	Scanner scan=new Scanner(System.in);
	public void book()
	{
		if(sets>0&&usercount>0)
		{
			if(usercount<=sets)
			{
				int payable=usercount*fare;
				System.out.println(Thread.currentThread().getName()+"enter the amount:");
				useramount=scan.nextInt();
				if(useramount>=payable)
				{
				sets-=usercount;
				useramount-=payable;
				if(useramount>0)
				{
					try
					{
						Thread.sleep(5000);
					}
					catch(InterruptedException er)
					{
					er.printStackTrace();	
					}
				}
				System.out.println(useramount+"tickets booked by"+Thread.currentThread().getName()+"withbalance"+"useramount:");
				
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+"insufficent"+"useramount"+"to book tickets for user count"+usercount);
				}
			
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+"can't book tickets:");
			}
		}
	}
	@Override
	public void run() {
		System.out.println("welcome........"+Thread.currentThread().getName()+"to laxhmitheater");
		synchronized(scan)
		{
			System.out.println("tell us how many tickets"+Thread.currentThread().getName());
			usercount=scan.nextInt();
			if(sets>0)
			{
				book();
			}
			else
			{
				System.out.println("housefull");
				Thread.currentThread().stop();
			}
			System.out.println("thanks for coming in laxhmi theater");
		}
		// TODO Auto-generated method stub
		System.out.println("fare amount is"+fare+"response to"+Thread.currentThread().getName()+"laxhmitheater");
	}
}	


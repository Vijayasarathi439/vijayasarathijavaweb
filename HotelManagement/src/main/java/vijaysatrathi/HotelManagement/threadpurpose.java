package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class threadpurpose {
	public static void main(String[] args) {
		manage manage=new manage();
		Thread t1=new Thread(manage,"sarathy");
		Thread t2=new Thread(manage,"vel");
		Thread t3=new Thread(manage,"kumar");
		Thread t4=new Thread(manage,"rajan");
		t1.start();t2.start();t3.start();t4.start();
	}

}
		class manage implements Runnable
		{
			private String[]crew= {"vijay","ajith","simbu","surya","kamel"};
			private Scanner scan=new Scanner(System.in);
			public void search(String name)
			{
				for(int index=0;index<crew.length;index++)
				{
					if(crew[index].equalsIgnoreCase(name))
					{
						System.out.println(name+"available @"+index);
						return;
					}
				}
				System.out.println(name+"doesnot found any where");
			}
			synchronized public void run()
			{
				System.out.println(Thread.currentThread().getName()+"tell as name to find crew:");
				System.out.println(Thread.currentThread().getId());
				System.out.println(Thread.currentThread().getPriority());
				search(scan.next());
			}
			
			
		}

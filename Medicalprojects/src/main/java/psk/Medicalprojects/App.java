package psk.Medicalprojects;
import java.util.Scanner;
public class App 
{
	public static void main(String[] args) 
	{
		 pskaccess  access=new  pskaccess ();
		 Thread t1=new Thread(access,"sarathy");
		 Thread t2=new Thread(access,"vijay");
		 Thread t3=new Thread(access,"gokulraj");
		 Thread t4=new Thread(access,"rajan");
		 t1.start();
		 t2.start();
		 t3.start();
		 t4.start();
		
		
		
	}
}
	  
				
		
									
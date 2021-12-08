package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class atmmision 
{
	public static void main(String[] args) throws InterruptedException
	{
	teller tel=new teller();
	Thread t1=new Thread(tel,"vijay");
	Thread t2=new Thread(tel,"vicky");
	Thread t3=new Thread(tel,"manikandan");
	Thread t4=new Thread(tel,"nagarajan");
	t1.start();t1.join();
	t2.start();t2.join();
	t3.start();t3.join();
	t4.start();t4.join();

	
	}

}

class teller implements Runnable
{

	int t2000=10,f500=20,t100=50,o200=26;
	Scanner scan=new Scanner(System.in);
	int userrequested;
	String out="";
	public void denom()
	{
		out="";
		int tmpfind=userrequested,rcount=0,t2000s=t2000,f500s=f500,t200s=0200,t100s=t100;
		if(tmpfind>0)
		{
			if(t2000s>0)
			{
				rcount=tmpfind/2000;
				if(rcount>t2000s)
				{
					tmpfind-=(t2000s*2000);
					out+="2000 x"+t2000s+"\n";
					t2000s=0;
				}
				else
				{
					t2000s-=rcount;
					tmpfind-=(rcount*2000);
					out+="2000 x"+t2000s+"\n";
					
				}
			}
			if(tmpfind>0&&t500s>0)
			{
					rcount=tmpfind/500;
					if(rcount>t500s)
					{
						tmpfind-=(t500s*500);
						out+="500 x"+t500s+"\n";
						t500s=0;
					}
					else
					{
						t500s-=rcount;
						tmpfind-=(rcount*500);
						out+="500 x"+t500s+"\n";
		}
	}
			if(tmpfind>0&&t100s>0)
			{
					rcount=tmpfind/100;
					if(rcount>t100s)
					{
						tmpfind-=(t100s*100);
						out+="100 x"+t100s+"\n";
						t100s=0;
					}
					else
					{
						t100s-=rcount;
						tmpfind-=(rcount*100);
						out+="100 x"+t100s+"\n";
					}
			}
			if(tmpfind>0&&f200s>0)
			{
					rcount=tmpfind/200;
					if(rcount>f200s)
					{
						tmpfind-=(f200s*100);
						out+="200x"+f200s+"\n";
						f200s=0;
					}
					else
					{
						f200s-=rcount;
						tmpfind-=(rcount*200);
						out+="200 x"+f200s+"\n";
					}
			}
			if(tmpfind==0)
			{
				int t2000=t2000s;f500=t500s;o200=f200s;t100=t100s;
				System.out.println(Thread.currentThread().getName()+"withdraw"+"userrequested"+"with\n"+out);	
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+"can't"+"withdraw");
			}
		}
			else
			{
			System.out.println("invalid amount by"+Thread.currentThread().getName());	
			}
			
			
			}
		public void run()
		{
			System.out.println("welcome"+Thread.currentThread().getName());
			System.out.println("enter the requried amount");
			userrequested=(scan.nextInt());
			denom();
		}
	
		}

	

package vijaysatrathi.HotelManagement;
import java.util.Scanner;

public class snbprojects implements snbactions {
	snbbus[] bus=new snbbus[10];
	Scanner ven=new Scanner(System.in);
	public snbprojects()
	{
		bus[0]=new snbbus("snbbus","salem to sampalli",2,"1hr",30);
		bus[1]=new snbbus("snbbus","salem to omulur",1,"20min",10);
		bus[2]=new snbbus("snbbus","salem to mecheri",2,"45min",21);
		bus[3]=new snbbus("snbbus","salem to ramannager",3,"1hr",30);
		bus[4]=new snbbus("snbbus","salem to karumallikudal",2,"1.30hr",35);
		bus[5]=new snbbus("snbbus","salem to salemcamp",2,"1.45hrs",40);
		bus[6]=new snbbus("snbbus","salem to rs",2,"1hr",30);
		bus[7]=new snbbus("snbbus","salem to mettur",2,"2hrs",50);
		bus[8]=new snbbus("snbbus","salem to sampalli",2,"1hr",30);
		
	}
	public static void main(String[] args) {
		snbbus f1=new snbbus();
		f1.setBusname("snb");
		f1.setCustomer(2);
		f1.setStops("mettur ton mecheri");
		f1.setTicketprice(20);
		f1.setTrevallingtime("45min");
		snbprojects bcc=new snbprojects();
		bcc.addnewcustomer(f1);
		bcc.saleslist("process");
		
		
	}
	
	

	@Override
	public String addnewcustomer(snbbus snbbus) {
		for(int i=0;i<bus.length;i++)
		{
				if(bus[i]==null)
				{
				bus[i]=snbbus;
				return snbbus.getStops()+"has added";
			}
		}
		return snbbus.getStops()+"has n't added";
		// TODO Auto-generated method stu
	}

	@Override
	public void saleslist(String process) {
		for(int i=0;i<bus.length;i++)
		{
		for(int sales=0;sales<bus.length;sales++)
		{
			
				snbbus snbbus = bus[9];
				bus[sales]=snbbus;
			
		}
		}
		
		}
		// TODO Auto-generated method stub
		
	

	@Override
	public void update(String process) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

}

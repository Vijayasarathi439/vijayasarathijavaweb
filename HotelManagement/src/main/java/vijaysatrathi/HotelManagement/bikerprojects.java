package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class bikerprojects implements bikeactions {
	bikestoruam[] bikes=new  bikestoruam[9];
	Scanner yea=new Scanner(System.in);
	public bikerprojects()
	{
		bikes[0]=new bikestoruam("ns","vijaymoters","sarathy",12500);
	}
	public static void main(String[] args) {
		bikestoruam f=new bikestoruam();
		f.setProducts("r15");
		f.setOwnername("logeshmoters");
		f.setSalesrep("kamel");
		f.setProfit(126000);
		bikestoruam bcc=new bikestoruam();
		
	}
	

	@Override
	public String addnewgroup(bikestoruam  bikestoruam) {
		for(int index=0;index<bikes.length;index++)
		{
			if(bikes[index]==null)
			{
				bikes[index]=bikestoruam;
		return bikestoruam.getProducts()+"has added";	
				
			}
		}
		return bikestoruam.getProducts()+"has n't added";
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listallgroups() {
		for(bikestoruam l:bikes)
		{
			System.out.println(l);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortgroup() {
		// TODO Auto-generated method stub
		
	}
	
	

}

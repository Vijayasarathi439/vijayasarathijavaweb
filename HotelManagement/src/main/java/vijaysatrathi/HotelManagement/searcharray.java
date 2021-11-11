package vijaysatrathi.HotelManagement;
import java.util.Scanner;
public class searcharray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] name= {"vijay","ajith","surya","kamel","rajini"};
		System.out.println("tell about your favourite actor:");
		String favor=s.nextLine();
		for(int pos=0;pos<name.length;pos++)
		{
			if(favor.equalsIgnoreCase(name[pos]))
			{
			
			System.out.println(favor+"actorfound @"+pos);
			return;
		}
		}
		System.out.println(favor+"actor is not found");
		
		
		
		
		
		
		
		
		
		
		
	}

}

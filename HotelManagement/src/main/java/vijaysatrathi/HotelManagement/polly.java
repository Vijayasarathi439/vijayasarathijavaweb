package vijaysatrathi.HotelManagement;

public class polly extends polymorphism{
	public void reading()
	{
		System.out.println("reading");
	}
	public static void main(String[] args) {
	   polymorphism p = new polly();
	   p.run();
       polly p1=new polly();
       p1.reading();
        
		
	}

}

package vijaysatrathi.HotelManagement;

public class modifiers {
	public static void main(String[] args) {
		String mytech="vijayasarathi";
		String mytechie=  new String("vijayasarathi");
		System.out.println(mytech.length()+""+mytechie.length());
		mytech.trim();
		System.out.println(mytech.length()+""+mytechie.length());
		mytech=mytech.trim();
		System.out.println(mytech.equals(mytechie));
		System.out.println(mytech.equalsIgnoreCase(mytechie));
		System.out.println(mytech.equalsIgnoreCase(mytechie));
		System.out.println(mytech.compareToIgnoreCase(mytechie));
		mytech=mytech.toLowerCase();
		mytechie=mytechie.toUpperCase();
		System.out.println(mytech.compareTo(mytechie));
		System.out.println(mytech.contains("athi"));
		mytech=mytech.replaceAll("athi", "ethi");
		System.out.println(mytech+""+mytechie);
		System.out.println(mytech.getBytes());
		System.out.println(mytech.charAt(6));
		System.out.println(mytech.substring(3, 9));
		System.out.println(mytech.getBytes());
		System.out.println(mytech.contains("athi"));
		System.out.println(mytechie.contains("athi"));
		System.out.println(mytech.charAt(4));
		System.out.println(mytech.substring(3, 9));
	}

}

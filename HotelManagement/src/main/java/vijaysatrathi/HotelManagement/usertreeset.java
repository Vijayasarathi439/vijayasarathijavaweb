package vijaysatrathi.HotelManagement;

import java.util.TreeSet;

public class usertreeset
{
public static void main(String[] args) {
	TreeSet<mobile> kumaranmobiles=new TreeSet<mobile>();
	kumaranmobiles.add(new mobile("redmi","1gp",16000));
	kumaranmobiles.add(new mobile("oppo","3gp",26000));
	kumaranmobiles.add(new mobile("realme","4gp",36000));
	kumaranmobiles.add(new mobile("asus","12gp",46000));
	kumaranmobiles.add(new mobile("apple","6gp",66000));
	System.out.println(kumaranmobiles);
	
}
}
class mobile implements Comparable<mobile>
{
	String model,ram;
	int price;
	public mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public mobile(String model, String ram, int price) {
		super();
		this.model = model;
		this.ram = ram;
		this.price = price;
	}
	public String toString() {
		return "mobile [model=" + model + ", ram=" + ram + ", price=" + price + "]\n";
	}
	@Override
	public int compareTo(mobile o) {
		// TODO Auto-generated method stub
		return o.ram.compareTo(this.ram);
	}
	
}


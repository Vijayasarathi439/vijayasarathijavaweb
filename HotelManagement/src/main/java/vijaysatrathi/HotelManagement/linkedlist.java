package vijaysatrathi.HotelManagement;

import java.util.LinkedList;

public class linkedlist 
{
	public static void main(String[] args) {
		LinkedList<Integer>yea=new LinkedList<Integer>();
		yea.addFirst(76);yea.addLast(8);yea.add(0,890);yea.add(3, 78);yea.add(789);
		System.out.println(yea);
		yea.remove();
		yea.remove(2);
		yea.removeLast();
		System.out.println(yea);
		System.out.println(yea.contains(8));
		System.out.println(yea.get(0));
		System.out.println(yea.getFirst());
		System.out.println(yea.getLast());
		yea.set(1, 111111);
		System.out.println(yea);
		yea.clear();
		System.out.println(yea);
	}
}

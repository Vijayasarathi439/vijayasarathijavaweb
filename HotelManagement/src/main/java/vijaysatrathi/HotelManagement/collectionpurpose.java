package vijaysatrathi.HotelManagement;

import java.util.Iterator;
import java.util.Stack;

public class collectionpurpose 
{
public static void main(String[] args) {
	Stack a=new Stack();
	a.push("sarathi");a.push('a');a.push(76);a.push(98090);a.push("y7");a.push(76789789980089L);a.push(false);
	System.out.println(a);
	Stack<Integer> b=new Stack<Integer>();
	b.push(789);
	b.push(7);
	b.push(67);
	b.push(5689);
	System.out.println(b);
	Iterator it=a.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	Iterator<Integer> yea=b.iterator();
	while(yea.hasNext())
	{
		System.out.println(yea.next());
	}
	System.out.println(a.empty());
	System.out.println(a.pop());
	a.pop();
	System.out.println(a.peek());
	System.out.println(a.search(false));
	Stack<String>yr=new Stack<String>();
	yr.push("fg");
	System.out.println(yr);

}
}

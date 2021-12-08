package vijaysatrathi.HotelManagement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class hashset 
{
public static void main(String[] args) {
	HashSet<Integer>scan=new HashSet<Integer>();
scan.add(978);
scan.add(877);
scan.add(809);
scan.add(89);
scan.add(7);
System.out.println(scan);
TreeSet<Integer> hash=new TreeSet<Integer>();
hash.addAll(scan);
System.out.println("hashset:"+scan);
System.out.println("treeset:"+hash);
Iterator<Integer>add=scan.iterator();
while(add.hasNext())
{
	System.out.println(add.next());
}
scan.remove(877);
System.out.println(scan);
System.out.println(scan.contains(7));
System.out.println("hashset:"+scan);
System.out.println("treeset:"+hash);
hash.retainAll(scan);
System.out.println("hashset:"+scan);
System.out.println("treeset:"+hash);
}
}

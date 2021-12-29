package vijaysatrathi.HotelManagement;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class mapcollection
{
	public static void main(String[]  args)
	{
		Hashtable<String, mobile> owner=new Hashtable<String,mobile>();
		mobile mob=new mobile("redmiy2","1128gp",898);
		mobile mob1=new mobile("asuz","428gp",17898);
		mobile mob2=new mobile("realme","28gp",70898);
		mobile mob3=new mobile("micro","628gp",78898);
		owner.put("vijay", mob3);
		owner.put("rajan", mob2);
		owner.put("rajan", mob1);
		owner.put("nagarajan", mob1);
		System.out.println(owner);
		owner.remove(mob3);
		System.out.println(owner);
		System.out.println(owner.containsKey(mob3));
		System.out.println(owner.containsValue("rajan"));
		System.out.println(owner.get("mob2"));
		System.out.println(owner);
		Set<String> users=owner.keySet();
		System.out.println(users);
		Collection<mobile>phone=owner.values();
		System.out.println(phone);	
	}
}
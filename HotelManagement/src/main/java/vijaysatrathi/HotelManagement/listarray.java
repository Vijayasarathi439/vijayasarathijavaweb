package vijaysatrathi.HotelManagement;
import java.util.InputMismatchException;
import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class App implements pskactions {
	  pskpharama[] pharama = new pskpharama[12];
	  Scanner scan = new Scanner(System.in);
	  public App() {
		pharama[0] = new pskpharama("ketoflyshop", "psk", "karthika", "rajan", 60000);
		pharama[1] = new pskpharama("paracemental", "friends", "rana", "vijay", 26000);
		pharama[2] = new pskpharama("ommeecaps", "drughouse", "palani", "manoj", 16000);
		pharama[3] = new pskpharama("benta-l", "prime", "sabrai", "murgan", 9000);
		pharama[4] = new pskpharama("okacet", "anathsuricals", "nagaraj", "sacikumar", 6000);
		pharama[5] = new pskpharama("spanmonsal", "manipharema", "gokulraj", "raman", 8000);
		pharama[6] = new pskpharama("dispoven", "sathyeapharmacy", "ramkumar", "velsamy", 6000);
		pharama[7] = new pskpharama("bd injection", "bawwapharmacy", "sathish", "kumar", 7000);
		pharama[8] = new pskpharama("powergel", "psk", "palani", "vijay", 5000);
	}

	public static void main(String[] args) {
		App app = new App();
		do {
			System.out.println("1.productname\n2.listall\n3.update\n4.delete\n5.sort\n6.search\n7.exit");
			int menu = app.scan.nextInt();
			String productname;
			switch (menu) {
			case 1:
				try {
				System.out.println("create new pskpharama  with mandete details  productname,companyname,ownername,workername,salary");
				pskpharama pskpharama = new pskpharama(app.scan.next(), app.scan.next(), app.scan.next(),
						app.scan.next(), app.scan.nextInt());
				System.out.println(app.addnewgroup(pskpharama));
				}
				catch(InputMismatchException cc)
				{
					System.out.println(cc+"\n enter the correct name:");
					pskpharama pskpharama = new pskpharama(app.scan.next(), app.scan.next(), app.scan.next(),
							app.scan.next(), app.scan.nextInt());
					System.out.println(app.addnewgroup(pskpharama));
					break;
				}
			case 2:
				System.out.println("listinag all productnames");
				app.listallgroups();
				break;
			case 3:
				try
				{
					System.out.println(" update by productname :");
					String name = app.scan.next();
					app.updategroup(name);
				}
				catch(NullPointerException bb)
				{
					System.out.println(bb+"\n invalid ente correctly");
				System.out.println(" update by productname :");
				String name = app.scan.next();
				app.updategroup(name);
				break;
				}
			
			case 4:
				try
				{
					System.out.println("delete  by productname : ");
					productname = app.scan.next();
					app.deletegroup(productname);
					break;
				}
			catch(NullPointerException dd)
			{
			System.out.println(dd+"\n enter the praparename");
				System.out.println("delete  by productname : ");
				productname = app.scan.next();
				app.deletegroup(productname);
				app.listallgroups();
				break;
			}
			case 5:
				System.out.println("sort by productsname ,companyname,ownername,workername,salary:");
				app.sortgroup();
				break;
			case 6:
				try
				{
					System.out.println("tell us salary");
					app.search(app.scan.nextInt());
				}
				catch(NullPointerException tt)
				{
				System.out.println(tt+"\n enter only numericals:");
					System.out.println("tell us salary");
					app.search(app.scan.nextInt());
					app.main(args);

				}
					break;
			}
		} while (true);
}
	public String addnewgroup(pskpharama pskpharama) {
		try
		{
			for (int index = 0; index < pharama.length; index++) {
				if (pharama[index] == null) {
					pharama[index] = pskpharama;
					return pskpharama.getProductname() + "has added";	
				}
			}
			throw new pskpharemanotfoundException();
	}
		catch(pskpharemanotfoundException er)
		{
			System.out.println(er+"\ndelete something inorder to add:");
			for(pskpharama f:pharama)
			{
				System.out.println(f.getProductname());
			}
			deletegroup(scan.next());
			return addnewgroup(pskpharama);
		}
	}

	@Override
	public void listallgroups() {
		// TODO Auto-generated method stub
		for (pskpharama k : pharama) {
			try
			{
			System.out.println(k.toString());
			}
			catch(NullPointerException arr)
			{
				System.out.println(arr);
				continue;
			}
		}
	}

	@Override
	public void deletegroup(String productname) {
		try
		{
			for (int index = 0; index < pharama.length; index++) {
				if (pharama[index].getProductname().equalsIgnoreCase(productname)) {
					System.out.println(productname + "from has removed successfully");
					return;

			}
		}
			throw new pskpharemanotfoundException();
	}
		catch(pskpharemanotfoundException pk)
		{
			System.out.println(pk+"\ninvalid pharama name except name to delete");
			for(pskpharama h:pharama)
			{
				System.out.println(h.getProductname());	
				
			}
			deletegroup(scan.next());
		}
	}

	@Override
	public void updategroup(String name) {
		try
		{
		for (int index = 0; index < pharama.length; index++) {
			if (pharama[index] == null)
				continue;
			if (pharama[index].getProductname().equalsIgnoreCase(name)) {
				System.out.print(pharama[index]);
				try
				{
				System.out.println("tell abouy your ubdate");
					String what = scan.next();
			switch (what) {
				case "productname":
					System.out.println("tel about your product name");
					String nm = scan.next();
					pharama[index].setProductname(nm);
					break;
				case "companyname":
					System.out.println("tell about your companyname");
					String company = scan.next();
					pharama[index].setCompanynmae(company);
					break;
				case "workername":
					System.out.println("tell about worker name");
					String worker = scan.next();
					pharama[index].setWorkername(worker);
					break;
				case "ownername":
					System.out.println("tell about worker name");
					String owner = scan.next();
					pharama[index].setOwnername(owner);
					break;
				case "salary":
					System.out.println("tell about worker salary");
					int sal = scan.nextInt();
					pharama[index].setSalary(sal);
					break;
					default:throw new pskpharemanotfoundException();
				}
				System.out.println(name + "has update" + name);
				return;
				}
			catch(pskpharemanotfoundException|InputMismatchException ve)
			{
				Scanner scans=new Scanner(System.in);
			
				System.out.println(ve+"nenter the except to update deatils:productname,companyname,workername,ownername,salary: ");
				System.out.println("tell us what to update");
				String what = scan.next();
				switch (what) {
					case "productname":
						System.out.println("tel about your product name");
						String nm = scans.next();
						pharama[index].setProductname(nm);
						break;
					case "companyname":
						System.out.println("tell about your companyname");
						String company = scans.next();
						pharama[index].setCompanynmae(company);
						break;
					case "workername":
						System.out.println("tell about worker name");
						String worker = scans.next();
						pharama[index].setWorkername(worker);
						break;
					case "ownername":
						System.out.println("tell about worker name");
						String owner = scans.next();
						pharama[index].setOwnername(owner);
						break;
					case "salary":
						System.out.println("tell about worker salary");
						int sal = scans.nextInt();
						pharama[index].setSalary(sal);
						break;
						default:System.out.println("maximum chance is over");
				
				}
				System.out.println(what+ "has update" + name);
				return;
			}
				
			}
		}
		throw new pskpharemanotfoundException();
		}
		catch(pskpharemanotfoundException vr)
		{
			System.out.println(vr+"\n enter the invaild pharamaname,enter correctly");
			for(pskpharama h:pharama)
			{
				System.out.println(h.getProductname());
			}
				updategroup(scan.next());	
			
		}
		
	}
	public  void search(int salary) {
		try
		{
			System.out.println("triyng to feach salary"+salary);
			for (int index = 0; index < pharama.length; index++) {
				if (pharama[index] == null)
					continue;
				if (pharama[index].getSalary() >= salary) {
					System.out.println(pharama[index]);
					// TODO Auto-generated method stub
				}
				throw new pskpharemanotfoundException();
				
	}
		}
				catch(pskpharemanotfoundException br)
				{
					System.out.println(br+"\n enter only numericals:");
					System.out.println("triyng to feach salary"+salary);
					for (int index = 0; index < pharama.length; index++) {
						if (pharama[index] == null)
							continue;
						if (pharama[index].getSalary() >= salary) {
							System.out.println(pharama[index]);
							// TODO Auto-generated method stub
						}
			
				for(pskpharama h:pharama)
				{
					System.out.println(h.getSalary());
				}
				search(scan.nextInt());
				// TODO Auto-generated method stub
			
		}
				}
	}
	@Override
	public void sortgroup() {
		pskpharama pskpharama = null;
		System.out.println("based on your sort");
		String what = scan.next();
		for (int hold = 0; hold < pharama.length; hold++) {
			for (int com = hold + 1; com < pharama.length; com++) {
				if (what.equalsIgnoreCase("productname")) 
				{
					if (pharama[com] == null || pharama[hold] == null)
						continue;
					if (pharama[hold].getProductname().compareTo(pharama[com].getProductname()) > 0) {
						pskpharama = pharama[hold];
						pharama[hold] = pharama[com];
						pharama[com] = pskpharama;
					}
				}

				else if (what.equalsIgnoreCase("companyname")) {
					if (pharama[com] == null)
						continue;
					if (pharama[hold].getCompanynmae().compareTo(pharama[com].getCompanynmae()) > 0) {
						pskpharama = pharama[hold];
						pharama[hold] = pharama[com];
						pharama[com] = pskpharama;

					}
				} 
				else if (what.equalsIgnoreCase("ownername"))
				{
					if (pharama[com] == null)
						continue;
					if (pharama[hold].getOwnername().compareTo(pharama[com].getOwnername()) > 0) {
						pskpharama = pharama[hold];
						pharama[hold] = pharama[com];
						pharama[com] = pskpharama;
					}
				} 
				else if (what.equalsIgnoreCase("workername")) 
				{
					if (pharama[com] == null)
						continue;
					if (pharama[hold].getWorkername().compareTo(pharama[com].getWorkername()) > 0)
					{
						pskpharama = pharama[hold];
						pharama[hold] = pharama[com];
						pharama[com] = pskpharama;

					}
				}
				else if(what.equalsIgnoreCase("salary"))
				{
					if (pharama[com] == null)
						continue;
					if(pharama[hold].getSalary()>=pharama[com].getSalary())
					{
						pskpharama=pharama[hold];
						pharama[hold] = pharama[com];
						pharama[com] = pskpharama;
					}
				}

			}
			// TODO Auto-generated method stub

		}
	}
}
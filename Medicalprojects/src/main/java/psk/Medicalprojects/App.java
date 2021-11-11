package psk.Medicalprojects;

import java.awt.geom.Dimension2D;
import java.util.Scanner;

public class App implements pskactions {
	pskpharama[] pharama = new pskpharama[12];
	Scanner scan = new Scanner(System.in);

	public App() {
		pharama[0] = new pskpharama("genric", "psk", "karthika", "rajan", 60000);
		pharama[1] = new pskpharama("paracemental", "psk", "karthika", "vijay", 26000);
		pharama[2] = new pskpharama("ommeecaps", "psk", "karthika", "manoj", 16000);
		pharama[3] = new pskpharama("benta-l", "psk", "karthika", "vicky", 9000);
		pharama[4] = new pskpharama("okacet", "psk", "karthika", "vijay", 6000);
		pharama[5] = new pskpharama("spanmonsal", "psk", "karthika", "vel", 8000);
		pharama[6] = new pskpharama("dispoven", "psk", "karthika", "logesh", 6000);
		pharama[7] = new pskpharama("bd injection", "psk", "karthika", "kumar", 7000);
		pharama[8] = new pskpharama("powergel", "psk", "palani", "vijay", 5000);
	}

	public static void main(String[] args) {
		App app = new App();
		do {
			System.out.println("1.pskpharama\n2.listall\n3.update\n4.delete\n5.sort\n6.search\n7.exit");
			int menu = app.scan.nextInt();
			switch (menu) {
			case 1:
				System.out.println(
						"create new pskpharama  with mandete details  productname,companyname,ownername,workername,salary");
				pskpharama pskpharama = new pskpharama(app.scan.next(), app.scan.next(), app.scan.next(),
						app.scan.next(), app.scan.nextInt());
				System.out.println(app.addnewgroup(pskpharama));
				break;
			case 2:
				System.out.println("listinag all productnames");
				app.listallgroups();
				break;
			case 3:
				System.out.println(" update by productname :");
				String name = app.scan.next();
				app.updategroup(name);
				break;
			case 4:
				System.out.println("delete  by productname : ");
				name = app.scan.next();
				app.deletegroup(name);
				break;
			case 5:
				System.out.println("sort by productsname");
				app.sortgroup();
				break;
			case 6:
				System.out.println("search based productname or comapanyname or workername or salary");
				String what = app.scan.next();
				switch (what) {
				case "salary":
					System.out.println("tell us salary");
					app.search(app.scan.nextInt());
					break;
				default:
					System.out.println("nothing to search");
				}
				break;
			default:
				return;
			}
		} while (true);
	}

	/*
	 * pskpharama f1=new pskpharama(); f1.setProductname("cipla");
	 * f1.setCompanynmae("pskpharama"); f1.setWorkername("vijay");
	 * f1.setOwnername("karthicka"); f1.setSalary(6000); App acc=new App();
	 * acc.listallgroups(); System.out.println(acc.addnewgroup(f1));;
	 * acc.deletegroup("bd injection"); acc.search(5000); acc.sortgroup();
	 * acc.listallgroups(); acc.updategroup("powergel"); acc.listallgroups();
	 * 
	 * acc.updategroup("okacet"); acc.searchgroup("palani",6000);
	 * 
	 * 
	 * }
	 */
	@Override
	public String addnewgroup(pskpharama pskpharama) {
		for (int index = 0; index < pharama.length; index++) {
			if (pharama[index] == null) {
				pharama[index] = pskpharama;
				return pskpharama.getProductname() + "has added";
			}
		}

		// TODO Auto-generated method stub
		return pskpharama.getProductname() + " has n't added";
	}

	@Override
	public void listallgroups() {
		// TODO Auto-generated method stub
		for (pskpharama k : pharama) {
			System.out.println(k);
		}
	}

	@Override
	public void deletegroup(String name) {
		for (int index = 0; index < pharama.length; index++) {
			if (pharama[index].getProductname().equalsIgnoreCase(name)) {
				pharama[index] = null;

				System.out.println(name + "from has removed successfully");
				return;

			}
		}
		System.out.println(name + "has n't found anywhare");
		// TODO Auto-generated method stub

	}

	@Override
	public void updategroup(String name) {
		for (int index = 0; index < pharama.length; index++) {
			if (pharama[index] == null)
				continue;
			if (pharama[index].getProductname().equalsIgnoreCase(name)) {
				System.out.print(pharama[index]);
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
				}
				System.out.println(name + "has update" + name);
				return;
			}
		}
		System.out.println(name + "hasn,tupdate" + name);
	}
	// TODO Auto-generated method stu

	public void search(int name) {
		System.out.println("triyng to feach salary");
		for (int index = 0; index < pharama.length; index++) {
			if (pharama[index] == null)
				continue;
			if (pharama[index].getSalary() >= name) {
				System.out.println(pharama[index]);
				// TODO Auto-generated method stub
				return;
			}
			
		}
		System.out.println("fetching n't salary");
	}
	// TODO Auto-generated method stub

	@Override
	public void sortgroup() {
		pskpharama pskpharama = null;
		System.out.println("based on your sort");
		String what = scan.next();
		for (int hold = 0; hold < pharama.length; hold++) {
			for (int com = hold + 1; com < pharama.length; com++) {
				if (what.equalsIgnoreCase("productname")) {
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
				} else if (what.equalsIgnoreCase("ownername")) {
					if (pharama[com] == null)
						continue;
					if (pharama[hold].getOwnername().compareTo(pharama[com].getOwnername()) > 0) {
						pskpharama = pharama[hold];
						pharama[hold] = pharama[com];
						pharama[com] = pskpharama;
					}
				} else if (what.equalsIgnoreCase("workername")) {
					if(pharama[com]==null)
						continue;
					if (pharama[hold].getWorkername().compareTo(pharama[com].getWorkername()) > 0) {
						pskpharama = pharama[hold];
						pharama[hold] = pharama[com];
						pharama[com] = pskpharama;

					}
				}

			}
			// TODO Auto-generated method stub

		}
	}
}
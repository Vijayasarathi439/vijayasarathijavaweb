package psk.Medicalprojects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;
public class pskaccess implements Runnable,pskactions
{
	File file=new File("C:\\Users\\ELCOT\\Desktop\\vijay\\java\\consoleproject.doc");
	FileOutputStream abc=null;ObjectOutputStream def=null;
	FileInputStream gh=null;ObjectInputStream xyz=null;
	ArrayList<pskpharama>pharam=null;
	Scanner scan=new Scanner(System.in);
	public void affect() throws IOException 
	{
		abc=new FileOutputStream(file);
		def=new ObjectOutputStream(abc);
		def.writeObject(pharam);
		abc.close();
		def.close();
		
	}
	public void featch() throws IOException, ClassNotFoundException
	{
		gh=new FileInputStream(file);
		xyz=new ObjectInputStream(gh);
		pharam=(ArrayList<pskpharama>)xyz.readObject();
		gh.close();
		xyz.close();
	}
		
		public  pskaccess()
		{
			
			
		}
		  synchronized public void run() throws NullPointerException
		  {
			  System.out.println("welcome to customer:"+Thread.currentThread().getName());
			 do
			{
				System.out.println("1.productname\n2.listall\n3.update\n4.delete\n5.sort\n6.search\n7.exit");
				int rasd = scan.nextInt();
				String productname;
				switch (rasd) {
				case 1:
					try {
					System.out.println("CREATE NEW PSKPHARMA MADETATE DETAILS PRODUCTNAME, COMPANYNAME, OWNERNAME,REPERESENTATIVENAME,PRICE:");
					pskpharama pskpharama = new pskpharama(scan.next(), scan.next(), scan.next(),
							scan.next(), scan.nextInt());
					System.out.println(addnewgroup(pskpharama));
					}
					catch(InputMismatchException cc)
					{
						System.out.println(cc+"\n enter the correct name:");
						pskpharama pskpharama = new pskpharama(scan.next(), scan.next(), scan.next(),
								scan.next(), scan.nextInt());
						System.out.println(addnewgroup(pskpharama));
						break;
					}
				case 2:
					System.out.println("listinag all productnames");
					listallgroups();
					break;
				case 3:
						System.out.println(" update by productname :");
						String name = scan.next();
						updategroup(name);
						break;
				case 4:
					try
					{
						System.out.println("delete  by productname : ");
						productname = scan.next();
						deletegroup(productname);
					}
				catch(NullPointerException dd)
				{
				System.out.println(dd+"\n enter the  productname:");
					System.out.println("delete  by productname : ");
					productname = scan.next();
					deletegroup(productname);
				}
					break;		
				case 5:
					System.out.println("sort by PRODUCTNAME ,COMPANYNAME,OWNERNAME,REPEREENSATIVENAME,PRICE:");
					sortgroup();
					listallgroups();
					break;
				case 6:
						try
						{
							System.out.println("tell us salary");
							search(scan.nextInt());
						}
						catch(NullPointerException oo)
						{
							System.out.println(oo+"\n Plese Exactly Correct SALARY");
							search(scan.nextInt());
							break;
						}
					break;
				default:Thread.currentThread().stop();
				}
			} while (true);
	}
		  
		public String addnewgroup(pskpharama pskpharama) 
		{
			try
			{
			featch();
			pharam.add(pskpharama);
			affect();
			}
			catch(IOException e) {}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			return pskpharama.getProductname()+"has'added";
		}

		public void listallgroups() 
		{
			// TODO Auto-generated method stub
			try
			{
			featch();
			Iterator<pskpharama>user=pharam.iterator();
			while(user.hasNext())
			{
				System.out.println(user.next());
			}
			}
			catch(IOException | ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			}
		
		public void deletegroup(String productname)
		{
			try
			{
			featch();
			List<pskpharama>tmp=new Vector<pskpharama>();
			tmp.addAll(pharam);
			try
			{
				for (int index=0;index<tmp.size();index++)
				{
					
					if(tmp.get(index).getProductname().equalsIgnoreCase(productname))
					{
						pharam.remove(tmp.get(index));
						System.out.println(productname + "from has removed successfully:");
						affect();
						return;
					}
				}
					throw new pskpharemanotfoundException();
				}
			
		
			catch(pskpharemanotfoundException pk)
			{
				System.out.println(pk+"\ninvalid pharama name except name to delete");
				for(pskpharama h:pharam)
				{
					System.out.println(h.getProductname());	
				}
				deletegroup(scan.next());
			}
		}
			catch(IOException e) {}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}
		public void updategroup(String name) 
		{
			try
			{
				featch();
			for(int index=0;index<pharam.size();index++)
			{
			
				if(pharam.get(index).getProductname().equalsIgnoreCase(name))
				{
					System.out.println("tell us what to update:");
					String what=scan.next();
					switch (what)
					{
					case "productname":
						System.out.println("tell us whats update name"+name);
						pharam.get(index).setProductname(scan.next());
						System.out.println(name+"productname has updated"+pharam.get(index).getProductname());
						affect();
						return;
					case "companyname":
						System.out.println("tell us update companyname"+name);
						pharam.get(index).setCompanyname(scan.next());
						System.out.println(name+"companyname has updated"+pharam.get(index).getCompanyname());
						affect();
						return;
					case "ownername":
						System.out.println("tell us update ownername"+name);
						pharam.get(index).setOwnername(scan.next());
						System.out.println(name+"ownername has updated"+pharam.get(index).getOwnername());
						affect();
						return;
					case "representativename":
						System.out.println("tell us update representativename"+name);
						pharam.get(index).setrepresentativename(scan.next());
						System.out.println(name+"representativename"+pharam.get(index).getrepresentativename());
						affect();
						return;
					case "price":
						System.out.println("tell us update price"+name);
						pharam.get(index).setprice(scan.nextInt());;
						System.out.println(name+"price"+pharam.get(index).getprice());
						affect();
						return;
					default:throw new pskpharemanotfoundException();
					}
				}
			}
		
			throw new pskpharemanotfoundException();
		}
			catch(pskpharemanotfoundException er)
		{
						System.out.println(er+"\n keyword update cannot matched");
						System.out.println("reference should be productname,companyname,ownername,representativename,price:");
						for(pskpharama f:pharam)
						{
							System.out.println(f.getProductname());
						}
						updategroup(scan.next());
		}
			catch(IOException | ClassNotFoundException er)
			{
				er.printStackTrace();
			}
		}
		public void search(int price)
		{			
		try
		{
			boolean yet=false;
			System.out.println("search based on salary:"+price);
			featch();
			for(pskpharama h:pharam)
			{
				if(h.getprice()==price)
				{
					yet=true;
					System.out.println(h);
				}
			}
			if(yet!=true)
				throw new pskpharemanotfoundException();
			}
		catch(pskpharemanotfoundException |IOException |ClassNotFoundException er)
		{
			System.out.println(er+"\n enter the salary:");
			search(scan.nextInt());
		}
		}
		public void sortgroup()
		{
			try
			{
			featch();
			Collections.sort(pharam);
			affect();
			}
			catch(IOException | ClassNotFoundException e)
			{
			
			}
		}
}




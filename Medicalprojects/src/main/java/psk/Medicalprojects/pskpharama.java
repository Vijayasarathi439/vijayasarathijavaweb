package psk.Medicalprojects;

import java.io.Serializable;

public class pskpharama implements Comparable<pskpharama>,Serializable 
{
	private String productname;
	private String companyname;
	private String ownername;
	private String representativename;
	private int price;
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getrepresentativename() {
		return representativename;
	}
	public void setrepresentativename(String reprsentativename) {
		this.representativename = reprsentativename;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "pskpharama [productname=" + productname + ", companyname=" + companyname + ", ownername=" + ownername
				+ ", representativename=" + representativename + ", price=" + price + "]";
	}
	
	public pskpharama(String productname, String companyname, String ownername, String representativename, int price) {
		super();
		this.productname = productname;
		this.companyname = companyname;
		this.ownername = ownername;
		this.representativename =representativename;
		this.price=price;
	}
	public pskpharama() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(pskpharama o) {
		// TODO Auto-generated method stub
		return this.productname.compareTo(o.productname);
	}
}

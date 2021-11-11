package vijaysatrathi.HotelManagement;

public class bikestoruam {
	private String  products;
	private String companyname;
	private String salesrep;
	private int profit;
	private String ownername;
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSalesrep() {
		return salesrep;
	}
	public void setSalesrep(String salesrep) {
		this.salesrep = salesrep;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	@Override
	public String toString() {
		return "bikestoruam [products=" + products + ", companyname=" + companyname + ", salesrep=" + salesrep
				+ ", profit=" + profit + ", ownername=" + ownername + "]";
	}
	
	public bikestoruam(String products, String companyname, String salesrep, int profit, String i) {
		super();
		this.products = products;
		this.companyname = companyname;
		this.salesrep = salesrep;
		this.profit = profit;
		this.ownername = i;
	}
	public bikestoruam() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

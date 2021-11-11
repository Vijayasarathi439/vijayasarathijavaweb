package vijaysatrathi.HotelManagement;

public class pskpharama {
	private String productname;
	private String companynmae;
	private String ownername;
	private String workername;
	private int salary;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCompanynmae() {
		return companynmae;
	}
	public void setCompanynmae(String companynmae) {
		this.companynmae = companynmae;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getWorkername() {
		return workername;
	}
	public void setWorkername(String workername) {
		this.workername = workername;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "pskpharama [productname=" + productname + ", companynmae=" + companynmae + ", ownername=" + ownername
				+ ", workername=" + workername + ", salary=" + salary + "]";
	}
	
	public pskpharama(String productname, String companynmae, String ownername, String workername, int salary) {
		super();
		this.productname = productname;
		this.companynmae = companynmae;
		this.ownername = ownername;
		this.workername = workername;
		this.salary = salary;
	}
	public pskpharama() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package vijaysatrathi.HotelManagement;

public class snbbus {
	private String busname;
	private String stops;
	private int customer;
	private String trevallingtime;
	private int ticketprice;
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public String getStops() {
		return stops;
	}
	public void setStops(String stops) {
		this.stops = stops;
	}
	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		this.customer = customer;
	}
	public String getTrevallingtime() {
		return trevallingtime;
	}
	public void setTrevallingtime(String trevallingtime) {
		this.trevallingtime = trevallingtime;
	}
	public int getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	@Override
	public String toString() {
		return "snbbus [busname=" + busname + ", stops=" + stops + ", customer=" + customer + ", trevallingtime="
				+ trevallingtime + ", ticketprice=" + ticketprice + "]";
	}
	public snbbus(String busname, String stops, int customer, String trevallingtime, int ticketprice) {
		super();
		this.busname = busname;
		this.stops = stops;
		this.customer = customer;
		this.trevallingtime = trevallingtime;
		this.ticketprice = ticketprice;
	}
	public snbbus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

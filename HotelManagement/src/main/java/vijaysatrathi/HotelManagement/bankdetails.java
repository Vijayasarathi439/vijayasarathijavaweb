package vijaysatrathi.HotelManagement;

 class bankdetails
 {
 int getrateofinterest()
	 return (0);
 }
 class sbi extends bankdetails
 {
	int getrateofinterest1()
	return (8);
 }
 class statebank extends bankdetails
 {
	 int getrateofinterest2()
	 return (10);
 }
	public void main(String[] args) {
sbi s=new sbi();
statebank a=new statebank();
System.out.println("sbi rate of interest:"+s.getrateofinterest());
System.out.println("statebank rate of interest:"+a.getrateofinterest());

		
	}

package Payment;

public class PayByCash implements Payment{
	
	private String address;
	
	public PayByCash(String address){
		this.address = address;	
	}
	
	public double pay(double amount) {
		return amount;
	}

}

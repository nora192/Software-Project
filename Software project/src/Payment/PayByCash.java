package Payment;

public class PayByCash extends Payment{
	
	private String address;
	
	public PayByCash(String address){
		this.address = address;	
	}
	
	public double pay(double amount) {
		return amount;
	}

	public void updateCredit(double amount) {
		// TODO Auto-generated method stub
	}

}

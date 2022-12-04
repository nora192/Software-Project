package Services;

import Payment.Payment;

public interface Services {
	
	public String name = "";
	public double price = 0;
	public Payment payment =null;
	
	public void setPayment (Payment p);
	
	public double pay();

}

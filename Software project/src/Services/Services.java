package Services;

import Payment.Payment;

public interface Services {

	public String name = "";
	public double price = 0;
	public Payment payment = null;

//	public void setPayment (Payment p);
//	public double getPrice();
//	public void setPrice(double price);
//	public String getServiceName();

	public double pay();

}
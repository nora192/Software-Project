package Donations;

import Payment.Payment;
import Services.Services;

public interface Donations extends Services {
	public String name = "";
	public double price = 0;
	public void setPayment (Payment p);
	public String description ();
	public double pay();

}

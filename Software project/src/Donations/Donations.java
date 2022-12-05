package Donations;

import Payment.Payment;
import Services.Services;

public interface Donations extends Services {
	public void setPayment (Payment p);
	public String description ();
	public String getName();
	public double pay();

}

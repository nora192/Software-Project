package Mobile;

import Payment.Payment;
import Services.Services;
import Services.IFormHandler;

public interface Mobile extends Services {
	public String name = "";
	public double price = 0;
	public void setPayment (Payment p);
	public void setHandler (IFormHandler Handler);
	public String description ();
	public double pay();

}

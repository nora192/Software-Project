package Mobile;

import Payment.Payment;
import Services.Services;
import Services.IFormHandler;

public interface Mobile extends Services {

	public void setPayment (Payment p);
	public void setHandler (IFormHandler Handler);
	public String getName();
	public String description ();
	public double pay();

}

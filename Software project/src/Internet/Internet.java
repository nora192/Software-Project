package Internet;

import Payment.Payment;
import Services.Services;
import Services.IFormHandler;

public interface Internet extends Services {
	
	public String name = "";
	public double price = 0;
	public void setPayment (Payment p);
	public String description ();
	public String getName();
	public void setHandler(IFormHandler Handler);
	public double pay();

}


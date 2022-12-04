package Internet;

import Payment.Payment;
import Services.Services;

public interface Internet extends Services {
	
	public String name = "";
	public double price = 0;
	public void setPayment (Payment p);
	public String decription ();
	
}


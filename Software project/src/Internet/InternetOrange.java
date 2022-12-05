package Internet;

import Payment.Payment;
import Services.IFormHandler;

public class InternetOrange implements Internet {

	public String name = "";
	public double price = 0;
	public Payment p = null;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}


	public InternetOrange(String name, double price) {
		this.name = name;
		this.price = price;
	}


	public double pay() {
		return p.pay(price); 
	}


	public String description() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	
	public void setPayment(Payment p) {
		this.p = p;
	}
	
	

}

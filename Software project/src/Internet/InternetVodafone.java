package Internet;

import Payment.Payment;
import Services.IFormHandler;

public class InternetVodafone implements Internet {

	public String name = "Internet Vodafone";
	public double price = 250;
	public Payment p = null;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}


	public InternetVodafone(String name, double price) {
		this.name = name;
		this.price = price;
	}
public InternetVodafone()
{}

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

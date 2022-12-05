package Internet;

import Payment.Payment;
import Services.IFormHandler;

public class InternetWE implements Internet {

	public String name = "";
	public double price = 0;
	public Payment p = null;
	public IFormHandler MyHandler;
	
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public InternetWE(String name, double price) {
		this.name = name;
		this.price = price;
	}
public InternetWE(){}

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

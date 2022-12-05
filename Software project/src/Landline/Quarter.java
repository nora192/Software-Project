
package Landline;

import Internet.Internet;
import Payment.Payment;
import Services.IFormHandler;

public class Quarter implements Landline {

	public String name = "Quarter Service";
	public double price = 600;
	public Payment p = null;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}

	public Quarter(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Quarter()
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

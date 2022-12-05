
package Landline;

import Internet.Internet;
import Payment.Payment;
import Services.IFormHandler;

public class Monthly implements Landline {

	public String name = "Monthly";
	public double price = 800;
	public Payment p = null;


	public Monthly(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Monthly(){};
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
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

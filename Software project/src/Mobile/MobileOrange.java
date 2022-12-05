
package Mobile;

import Payment.Payment;
import Services.IFormHandler;
import User.IUser;

public class MobileOrange implements Mobile {

	String ServiceName = "MobileOrange";
	IUser user;
	public double price = 0;
	public Payment p;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}
	public MobileOrange(String name, double price) {
		this.ServiceName = ServiceName;
		this.price = price;
	}


	public String description() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	public void setPayment(Payment p) {
		this.p = p;
	}
	
	public double pay() {
		return p.pay(price);

	}
	
	

}

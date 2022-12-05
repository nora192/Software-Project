
package Mobile;

import Payment.Payment;
import Services.IFormHandler;
import User.IUser;

public class MobileOrange implements Mobile {

	String ServiceName = "MobileOrange";
	public double price = 300;
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
	public String getName() {
		return this.ServiceName;
	}
	public MobileOrange(){}
	public String description() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.ServiceName;
	}
	public void setPayment(Payment p) {
		this.p = p;
	}
	
	public double pay() {
		return p.pay(price);

	}
	
	

}


package Mobile;

import Payment.Payment;
import Services.IFormHandler;
import User.IUser;

public class MobileEtisalat implements Mobile {

	String ServiceName = "Mobile Etisalat";
	public double price = 250;
	public Payment p;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}

	@Override
	public String getName() {
		return this.ServiceName;
	}


	public MobileEtisalat(String name, double price) {
		this.ServiceName = ServiceName;
		this.price = price;
	}
	public MobileEtisalat(){}

	public void setPayment(Payment p) {
		this.p = p;
	}

	public double pay() {
		return p.pay(price);

	}

	public String description() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.ServiceName;
	}


}

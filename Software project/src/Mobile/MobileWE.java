
package Mobile;

import Payment.Payment;
import Services.IFormHandler;
import User.IUser;
import User.User;

import java.util.ArrayList;

public class MobileWE implements Mobile{

	String ServiceName = "Mobile We";

	public double price = 500;
	
	public Payment p;
	public IFormHandler MyHandler;

	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}

	
	public String getName() {
		// TODO Auto-generated method stub
		return ServiceName;

	}
	
	public MobileWE()
	{}

	public void setPayment(Payment p) {
		this.p = p;
	}

	
	public double pay() {
		return p.pay(price);
		
	}

	public String description() {
		return "welcome to the services of " + this.ServiceName;
	}
	


}

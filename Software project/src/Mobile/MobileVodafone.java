
package Mobile;

import Payment.Payment;
import Services.IFormHandler;
import User.IUser;

public class MobileVodafone implements Mobile {

	String ServiceName = "MobileVodafone";

	public double price = 400;
	
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
	
	public MobileVodafone(){}


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

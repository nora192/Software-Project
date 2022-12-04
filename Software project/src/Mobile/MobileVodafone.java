
package Mobile;

import Payment.Payment;
import User.IUser;

public class MobileVodafone implements Mobile {

	String ServiceName = "MobileVodafone";
	IUser user;
	public double price = 0;
	public Payment p;


	public MobileVodafone(String name, double price) {
		this.ServiceName = ServiceName;
		this.price = price;
	}


	public void setPayment(Payment p) {
		this.p = p;
	}
	
	public double pay() {
		return p.pay(price);
	}


	public String description() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name;
	}
	
	
	

}

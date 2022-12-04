
package Mobile;

import Payment.Payment;
import User.IUser;

public class MobileWE implements Mobile {

	String ServiceName = "MobileWE";
	IUser user;
	public double price = 0;
	public Payment p;



	public MobileWE(String name, double price) {
		this.ServiceName = ServiceName;
		this.price = price;
	}

	public void setPayment(Payment p) {
		this.p = p;
	}
	
	public double pay() {
		return p.pay(price );
	}

	public String description() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getServiceName(){
		return ServiceName;
	}

}

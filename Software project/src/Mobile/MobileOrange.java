
package Mobile;

import Payment.Payment;
import User.IUser;

public class MobileOrange implements Mobile {

	String ServiceName = "MobileOrange";
	IUser user;
	public double price = 0;
	public Payment p;
	public double DiscountPrice = 1;


	public void setDiscountPrice(double DiscountPrice) {
		this.DiscountPrice = DiscountPrice;
	}

	@Override
	public double getDiscountPrice() {
		return DiscountPrice;
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

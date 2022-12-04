
package Mobile;

import Payment.Payment;
import User.IUser;

public class MobileWE implements Mobile {

	String name;
	IUser user;
	public double price = 0;
	public Payment p;
	public double DiscountPrice;


	public void setDiscountPrice(double DiscountPrice) {
		this.DiscountPrice = DiscountPrice;
	}

	@Override
	public double getDiscountPrice() {
		return DiscountPrice;
	}


	public MobileWE(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setPayment(Payment p) {
		this.p = p;
	}
	
	public double pay() {
		return p.pay(price * DiscountPrice);
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
		return name;
	}

}

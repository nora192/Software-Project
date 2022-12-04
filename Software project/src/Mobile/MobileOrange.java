
package Mobile;

import Internet.Internet;
import Payment.Payment;
import User.IUser;

public class MobileOrange implements Mobile {

	String ServiceName = "MobileOrange";
	IUser user;
	public double price = 0;
	public Payment p;
	
	public MobileOrange(String name, double price) {
		this.ServiceName = ServiceName;
		this.price = price;
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

	public String decription() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	public void setPayment(Payment p) {
		this.p = p;
	}
	
	public void pay() {
		p.pay(price);	
	}
	
	

}

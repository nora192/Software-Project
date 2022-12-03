
package Mobile;

import Payment.Payment;

public class MobileWE implements Mobile {

	public String name = "";
	public double price = 0;
	public Payment p = null;
	
	public MobileWE(String name, double price) {
		this.name = name;
		this.price = price;
	}


	public double pay() {
		return p.pay(price);	
	}

	public String decription() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	
	public void setPayment(Payment p) {
		this.p = p;
	}
	
	

}


package Mobile;

import Payment.Payment;
import Services.IFormHandler;
import User.IUser;
import User.User;

import java.util.ArrayList;

public class MobileWE implements Mobile{

	String name = "Mobile We";
	ArrayList<IUser > UsersList = new ArrayList< IUser>();
	ArrayList<ArrayList<String>> FormList = new ArrayList <ArrayList<String>>();
	public double price = 500;
	public Payment p;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}
	public MobileWE(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public MobileWE()
	{}

	public void setPayment(Payment p) {
		this.p = p;
	}

	
	public double pay() {
		return p.pay(price );
	}

	public String description() {
		return "welcome to the services of " + this.name; 
	}
	


}

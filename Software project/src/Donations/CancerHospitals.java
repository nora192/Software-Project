
package Donations;

import Internet.Internet;
import Payment.Payment;
import Services.IFormHandler;

public class CancerHospitals implements Donations {

	public String name = "Cancer Hospitals";
	public double price = 1500;
	public Payment p = null;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}

	public CancerHospitals(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public CancerHospitals(){}

	public double pay() {
		return p.pay(price); 
	}


	public String description() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}

	@Override
	public String getName() {
		return this.name;
	}

	public void setPayment(Payment p) {
		this.p = p;
	}
	
	

}

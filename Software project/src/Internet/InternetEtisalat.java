package Internet;
import Internet.Internet;
import Mobile.Mobile;
import Payment.Payment;
import Services.IFormHandler;

public class InternetEtisalat implements Internet {

	public String name = "Internet Etisalat";
	public double price = 190;
	public Payment p = null;
	public IFormHandler MyHandler;
	public void setHandler(IFormHandler Handler)
	{
		this.MyHandler = Handler;
	}


	public InternetEtisalat(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public InternetEtisalat(){}
	
	public double pay() {
		return p.pay(price); 
	}

	public String description() {

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

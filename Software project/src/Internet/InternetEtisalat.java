package Internet;
import Internet.Internet;
import Mobile.Mobile;
import Payment.Payment;
public class InternetEtisalat implements Internet {

	public String name = "";
	public double price = 0;
	public Payment p = null;


	public InternetEtisalat(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double pay() {
		return p.pay(price); 
	}

	public String description() {

		return "welcome to the services of " + this.name; 
	}


	public void setPayment(Payment p) {
		this.p = p;
	}

	
	

}

package ServiceFactory;

import Internet.Internet;
import Internet.InternetWE;
import Mobile.Mobile;
import Mobile.MobileWE;

public class WEFactory implements ServiceFactory {

	public String name;
	public double price;
	
	public WEFactory(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Mobile createProductInternet() {
		// TODO Auto-generated method stub
		return new MobileWE(name, price);
	}

	public Internet createProductMobile() {
		// TODO Auto-generated method stub
		return new InternetWE(name, price);
	}

}

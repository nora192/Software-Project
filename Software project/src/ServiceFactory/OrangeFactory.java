package ServiceFactory;

import Internet.Internet;
import Internet.InternetOrange;
import Mobile.Mobile;
import Mobile.MobileOrange;

public class OrangeFactory implements ServiceFactory {

	public String name;
	public double price;
	
	public OrangeFactory(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Mobile createProductInternet() {
		return new MobileOrange();
	}

	public Internet createProductMobile() {
		// TODO Auto-generated method stub
		return new InternetOrange(name, price);
	}

}

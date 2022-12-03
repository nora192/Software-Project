package ServiceFactory;

import Internet.Internet;
import Internet.InternetVodafone;
import Mobile.Mobile;
import Mobile.MobileVodafone;
import Services.Services;

public class VodafoneFactory implements ServiceFactory {
	
	public String name;
	public double price;

	
	public VodafoneFactory(String name, double price) {
		this.name = name;
		this.price = price;
		
	}

	public Mobile createProductInternet() {
		// TODO Auto-generated method stub
		return new MobileVodafone(name, price);	
	}

	public Internet createProductMobile() {
		
		return new InternetVodafone(name, price);
	}
	


}

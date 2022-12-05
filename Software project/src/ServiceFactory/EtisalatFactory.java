package ServiceFactory;

import Internet.Internet;
import Internet.InternetEtisalat;
import Mobile.Mobile;
import Mobile.MobileEtisalat;

public class EtisalatFactory implements ServiceFactory {
	
	public String name;
	public double price;
	
	public EtisalatFactory() {
		
	}

	public Mobile createProductInternet() {
		// TODO Auto-generated method stub
		return (Mobile) new MobileEtisalat();
	}

	public Internet createProductMobile() {
		// TODO Auto-generated method stub
		return new InternetEtisalat(name, price);
	}

}

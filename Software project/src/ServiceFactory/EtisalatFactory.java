package ServiceFactory;

import Internet.Internet;
import Mobile.Mobile;

public class EtisalatFactory implements ServiceFactory {

	public Internet createProductInternet() {
		return internet;
		// TODO Auto-generated method stub
		
	}

	public Mobile createProductMobile() {
		return mobile;
		// TODO Auto-generated method stub
		
	}

}

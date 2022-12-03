package ServiceFactory;

import Internet.Internet;
import Mobile.Mobile;

public class VodafoneFactory implements ServiceFactory {

	public Internet createProductInternet() {
		return new Internet();
		
	}

	public Mobile createProductMobile() {
		return new Mobile();
		
	}

}

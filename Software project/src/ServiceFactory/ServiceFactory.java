package ServiceFactory;

import Internet.Internet;
import Mobile.Mobile;

public interface ServiceFactory {
	
	public Internet createProductInternet();
	public Mobile createProductMobile();
}

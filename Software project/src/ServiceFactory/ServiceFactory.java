package ServiceFactory;

import Internet.Internet;
import Mobile.Mobile;
import Services.Services;

public interface ServiceFactory {
	
	public Mobile createProductInternet();
	public Internet createProductMobile();
}

package ServiceFactory;

import Internet.Internet;
import Mobile.Mobile;

public interface ServiceFactory {
	
	public void createProductInternet(Internet internet);
	public void createProductMobile(Mobile mobile);
}

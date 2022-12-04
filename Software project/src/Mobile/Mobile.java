package Mobile;

import Services.Services;

public interface Mobile extends Services {
	public String name = "";
	public double price = 0;
	public double getPrice();
	public String decription ();
	public void setPrice(double price);
	public String getServiceName();
}

package Donations;

import Services.Services;

public interface Donations extends Services {
	public String name = "";
	public double price = 0;
	
	public String decription ();
}
package Internet;

public class InternetOrange implements Internet {

	public String name = "";
	public double price = 0;
	
	public InternetOrange(String name, double price) {
		this.name = name;
		this.price = price;
	}


	public double pay() {

		return price;
	}


	public String decription() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	
	

}

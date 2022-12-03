package Internet;

public class InternetWE implements Internet {

	public String name = "";
	public double price = 0;
	
	public InternetWE(String name, double price) {
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

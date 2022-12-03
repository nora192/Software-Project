package Mobile;

public class MobileVodafone implements Mobile {

	public String name = "";
	public double price = 0;
	
	public void MobileOrange(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	public void pay() {
		
		
	}

	public String decription() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	
	

}


public class Monthly implements Landline {
	
	public String name = "";
	public double price = 0;
	
	
	public Monthly(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void pay() {
		// TODO Auto-generated method stub
		
	}


	public String decription() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}

}

package Donations;

public class NGOs implements Donations {
	
	public String name = "";
	public double amount = 0;
	
	
	public NGOs(String name, double price) {
		this.name = name;
		this.amount = price;
	}
	
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	public String decription() {
		// TODO Auto-generated method stub
		return "welcome to the services of " + this.name; 
	}
	
}
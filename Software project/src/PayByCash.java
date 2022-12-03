
public class PayByCash implements Payment{
	
	private String address;
	
	public PayByCash(String address){
		this.address = address;	
	}
	public void pay(int amount) {
		System.out.println("do pay by cash");
		
	}

}


public class PayByCard implements Payment{
	
	private ICreditCard creditCard;
	public PayByCard(ICreditCard creditCard){
		this.creditCard = creditCard;	
	}
	public void pay() {
		System.out.println("do pay by card");
		
	}
	

}

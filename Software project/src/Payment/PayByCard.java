package Payment;

public class PayByCard extends Payment{
	
	String cardNum;
	public PayByCard(String CardNum){
		this.cardNum = cardNum;	
	}
	public double pay(double amount) {
		return amount;
		// TODO Auto-generated method stub
		
	}
	

}

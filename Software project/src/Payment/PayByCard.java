package Payment;

public class PayByCard extends Payment{
	
	String cardNum;
	public IcreditCard credit;
	
	public PayByCard(String CardNum){
		this.cardNum = cardNum;	
	}

	
	public PayByCard(IcreditCard credit){
		this.credit = credit;
	}

	
	public double pay(double amount) {
		return amount;
	}
	
	public void updateCredit(double amount) {
		this.credit.decrement(amount);
	}
		// TODO Auto-generated method stub
		

}

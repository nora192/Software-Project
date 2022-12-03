package Payment;

public class PayByCard extends Payment{
	
	IcreditCard credit;
	public PayByCard(IcreditCard credit){
		this.credit = credit;
	}
	public void pay(double amount) {
		credit.decrement(amount);
	}

}

package Payment;

public class PayByCard extends Payment{
	
	IcreditCard credit;
	public PayByCard(IcreditCard credit){
		this.credit = credit;
	}
	public double pay(double amount) {
		if(credit.getAmount() >= amount){
			credit.decrement(amount);
			return amount;
		}
		else
			System.out.println("No enough money in your credit card.");
		
		return 0;
	}
	

}

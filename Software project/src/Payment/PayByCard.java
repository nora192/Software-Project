package Payment;

public class PayByCard implements Payment,UpdatedPayment{
	
	String cardNum;
	public IcreditCard credit;
	
	public PayByCard(String CardNum){
		this.cardNum = cardNum;	
	}

	
	public PayByCard(IcreditCard credit){
		this.credit = credit;
	}

	public double pay(double amount) {

		if(credit.getAmount() >= amount){
			//credit.decrement(amount);
			System.out.println(amount + "paid amount: ");
			return amount;
		}
		else
			System.out.println("No enough money in your credit card.");
		
		return 0;

	}

	public void UpdateAmount(double amount) {
		credit.decrement(amount);
	}
}

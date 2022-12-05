package Payment;

public class PayByWallet implements Payment, UpdatedPayment{
	IWallet wallet;
	
	public double pay(double amount) {
		
		if(wallet.getAmount() >= amount){
			System.out.println("paid amount: " + amount);
			return amount;
		}
		else {
			System.out.println("There is not enough money in your wallet.\n");
		}
		return 0;
		
	}

	public PayByWallet(IWallet wallet) {
		this.wallet = wallet;
	}
	
	public void UpdateAmount(double amount) {
		wallet.decriment(amount);
	}
}

package Payment;

public class PayByWallet implements Payment,UpdatedPayment{
	IWallet wallet;
	
	public double pay(double amount) {
		if(wallet.getAmount() >= amount){
			return amount;
		}
		else {
			System.out.println("There is not enough money in your wallet.");
		}
		return 0;
		
	}


	
	public void UpdateAmount(double amount) {
		wallet.decriment(amount);
	}
}

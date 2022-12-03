package Payment;

public class PayByWallet extends Payment{
	IWallet wallet;
	
	public void pay(double amount) {
		if(wallet.getAmount() >= amount){
			wallet.decriment(amount);
		}
		else {
			System.out.println("There is not enough money in your wallet.");
		}
	}

}

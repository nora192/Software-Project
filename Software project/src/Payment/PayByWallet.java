package Payment;

public class PayByWallet extends Payment{
	IWallet wallet;
	
	public double pay(double amount) {
		if(wallet.getAmount() >= amount){
			wallet.decriment(amount);
			return amount;
		}
		else {
			System.out.println("There is not enough money in your wallet.");
		}
		return 0;
		
	}

	public void updateCredit(double amount) {
		// TODO Auto-generated method stub
		
	}

}

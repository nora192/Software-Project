package Payment;

public abstract class IWallet {
	
	private double amount;

	public double getAmount(){
		return amount;
	}
	
	public void decriment(double am){
		amount -= am;
	}
	
	public void incriment(double am){
		amount += am;
	}
}

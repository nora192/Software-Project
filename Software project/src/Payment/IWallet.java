package Payment;

public abstract class IWallet {
	
	private double amount;

	public abstract double getAmount();
	
	public abstract void decriment(double am);
	
	public abstract void incriment(double am);
}

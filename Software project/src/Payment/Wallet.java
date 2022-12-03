package Payment;

public class Wallet extends IWallet {
	private String userName, password;
	private double amount;
	public Wallet(String userName, String password, double amount){
		this.userName = userName;
		this.amount = amount;
		this.password = password;
	}
	
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

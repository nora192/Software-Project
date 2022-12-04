package Payment;

import User.IUser;

import static User.User.transactions;

public class Wallet extends IWallet {
	private double amount;
	IUser user;
	public Wallet(IUser user, double amount){
		this.user = user;
		this.amount = amount;
	}
	public void setAmount(double am){
		amount = am;
	}
	public double getAmount(){
		return amount;
	}
	
	public void decriment(double am){
		amount -= am;
		transactions.add(am);
	}
	
	public void incriment(double am){
		amount += am;
		this.setAmount(amount);
	}
	
}

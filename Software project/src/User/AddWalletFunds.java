package User;


import Payment.IcreditCard;

public class AddWalletFunds implements UserService{
	
	double amount;
	IUser user;
	public AddWalletFunds(double amount, IUser user){
		this.amount = amount;
		this.user = user;
	}
	public void execute() {
		user.creditCard.decrement(amount);
		user.wallet.incriment(amount);
		
		// TODO Auto-generated method stub

	}


}

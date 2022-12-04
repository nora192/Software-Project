package User;


public class AddWalletFunds implements UserService{
	
	double amount;
	IUser user;
	public AddWalletFunds(double amount, IUser user){
		this.amount = amount;
		this.user = user;
	}
	public void execute() {
		user.getWallet().incriment(amount);
		
		// TODO Auto-generated method stub
	}

}

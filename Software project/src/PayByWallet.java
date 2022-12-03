
public class PayByWallet implements Payment{
	
	private IWallet wallet ;
	
	public PayByWallet(IWallet wallet){
		this.wallet = wallet;
	}
	
	public void pay(int amount) {
		System.out.println("do pay by wallet");
		
	}

}

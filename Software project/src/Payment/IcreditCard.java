package Payment;

public abstract class IcreditCard {
	private double amount;
	public double getAmount(){
        return amount;
    }
    public void setAmount(double Amount){
        this.amount = Amount;
    }
}

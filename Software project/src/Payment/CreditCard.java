package Payment;

public class CreditCard extends IcreditCard{
    private String ID;
    private String password;
    private double amount;
    public CreditCard(String ID, String password, double amount){
        this.ID = ID;
        this.password=password;
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double Amount){
        this.amount = Amount;
    }

    public void decrement(double am) {
        amount -= am;
    }
}

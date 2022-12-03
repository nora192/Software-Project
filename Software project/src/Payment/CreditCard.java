package Payment;

public class CreditCard extends IcreditCard{
    private String ID;
    private String password;
    private double amount;
    CreditCard(String ID,String password,double amount){
        this.ID = ID;
        this.password=password;
        this.amount=amount;
    }
    
}

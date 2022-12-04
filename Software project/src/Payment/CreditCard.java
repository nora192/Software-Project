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
    /*public void decrement(double amount) {
=======
    
    public void decrement(double amount) {
>>>>>>> branch 'main' of https://github.com/nora192/Software-Project.git
        if(this.getAmount()>=amount){
            double newAmount = getAmount()-amount;
            setAmount(newAmount);
        }
        
        else{
            System.out.println("Your Balance Is Less Than The Amount Your Want To Withdraw");
        }
    }*/
}

package User;

import Payment.IWallet;
import Payment.IcreditCard;

public class User extends IUser{
    IWallet wallet;
    IcreditCard creditCard=null;
    
    public User(String email,String password,String username){
        this.email = email;
        this.password = password;
        this.username=username;
    }
    
    void setCreditCard(IcreditCard creditCard){
        this.creditCard = creditCard;
    }
    
    void setWallet(IWallet wallet){
        this.wallet = wallet;
    }
}

package User;

import Payment.IWallet;
import Payment.IcreditCard;

public class User extends IUser{
    String email;
    String password;
    IWallet wallet;
    IcreditCard creditCard=null;
    User(String email,String password){
        this.email = email;
        this.password = password;
    }
    void setCreditCard(IcreditCard creditCard){
        this.creditCard = creditCard;
    }
    void setWallet(IWallet wallet){
        this.wallet = wallet;
    }
}

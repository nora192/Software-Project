package User;

import Payment.IWallet;
import Payment.IcreditCard;

import java.util.ArrayList;

public class User extends IUser{
    IWallet wallet;
    IcreditCard creditCard=null;
    public static ArrayList<Double> transactions = new ArrayList<Double>();
 

    public User(String email,String password,String username){
        this.email = email;
        this.password = password;
        this.username=username;
    }
    
    void setCreditCard(IcreditCard creditCard){
        this.creditCard = creditCard;
    }
    
   public void setWallet(IWallet wallet){
        this.wallet = wallet;
    }
    
    public IWallet getWallet(){
    	return wallet;
    }
}


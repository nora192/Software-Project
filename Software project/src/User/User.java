package User;

import Payment.IWallet;
import Payment.IcreditCard;

import java.util.ArrayList;

public class User extends IUser{
    IWallet wallet;
    IcreditCard creditCard=null;
    String refundState="";
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
    public void checkRefund(){
        if(refundState == ""){
            System.out.println("your request is still pending");
        }
        else if(refundState == "Accepted"){
            System.out.println("your request has been accepted by the admin and money has been returned to you");
        }
        else{
            System.out.println("your request has been rejected");
        }
    }
    public void updateRefundState(String s){
        refundState = s;
    }


}


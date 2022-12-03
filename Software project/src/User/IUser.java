package User;

import Payment.IWallet;
import Payment.IcreditCard;

public abstract class IUser {
    String username;
    String password;
    
    IWallet wallet;
    IcreditCard creditCard;
    
    abstract void setCreditCard(IcreditCard creditCard);
    abstract void setWallet(IWallet wallet);
}

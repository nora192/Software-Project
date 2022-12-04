package User;

import Payment.IWallet;
import Payment.IcreditCard;

public abstract class IUser {
    String username;
    String password;
    
    IWallet wallet;
    IcreditCard creditCard;
    
    abstract void setCreditCard(IcreditCard creditCard);
    public abstract void setWallet(IWallet wallet);
    public abstract IWallet getWallet();
}

package User;

import Payment.IWallet;
import Payment.IcreditCard;

public abstract class IUser {
    String username;
    String password;
    public String refundState="";
    public String email;
   public IWallet wallet;
    public IcreditCard creditCard;
    
    abstract void setCreditCard(IcreditCard creditCard);
    public abstract void setWallet(IWallet wallet);
    public abstract IWallet getWallet();
    public abstract void updateRefundState(String s);
    public abstract void checkRefund();
}

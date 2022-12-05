package User;

import Services.Services;

import java.security.Provider;

public class RefundsRequests implements IRefundsRequests{
    public IUser user;
    public Services service;
    public double amount;
    
    public RefundsRequests(IUser user,Services service , double amount){
        this.user = user;
        this.service = service;
        this.amount = amount;
    }

}

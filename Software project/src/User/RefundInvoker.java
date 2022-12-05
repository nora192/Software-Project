package User;

import java.security.Provider;

import static User.RefundHandling.refundRequests;
import Services.Services;
public class RefundInvoker implements IRefundInvoker{


    public void addRequestToList(IUser user, Services service,double amount){
        RefundsRequests req = new RefundsRequests(user,service,amount);
        refundRequests.add(req);
    }
}

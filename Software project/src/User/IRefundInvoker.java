package User;

import Services.Services;

public interface IRefundInvoker {
    RefundsRequests req = null;
    void addRequestToList(IUser user, Services service, double amount);
}

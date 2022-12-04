package User;

import Services.Services;

public interface IRefundInvoker {
    public RefundsRequests req = null;
    public void addRequestToList(IUser user, Services service, double amount);
}

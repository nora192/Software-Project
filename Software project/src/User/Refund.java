package User;

import static User.Admin.refundRequests;

public class Refund implements UserService {
	private int id;
	boolean flag;
	public Refund(int id){
		this.id = id;
	}
	public void execute() {
		if(flag){
			if(refundRequests.get(id).user.creditCard==null){
				refundRequests.get(id).user.wallet.incriment(refundRequests.get(id).amount);
			}
			else{
				refundRequests.get(id).user.creditCard.increment(refundRequests.get(id).amount);
			}
			refundRequests.get(id).user.updateRefundState("Accepted");
		}
		else{
			refundRequests.get(id).user.updateRefundState("Rejected");
		}
		refundRequests.remove(0);

	}
	public void getRespond(boolean respond){
		flag=respond;
	}


}

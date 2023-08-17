package in.Mritunjay;

public class BillCollector {
	
	private IPayment payment;
	
	public void setPaymrnt(IPayment payment) {
		this.payment = payment;
	}
	
	public BillCollector() {
		
	}
	
	public BillCollector(IPayment payment) {
		this.payment=payment;
	}
	
	
	
	public void collectPayment(double amount) {
		
		String Status = payment.pay(amount);
		
		System.out.println(Status);
		
	}

}

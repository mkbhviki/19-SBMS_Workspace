package in.Mritunjay;

public class BillCollector {

	private IPayment payment;

	// this is used for setter injection
	public void setPayment(IPayment payment) {
		System.err.println("setPayment()  :: executrd");
		this.payment = payment;
	}

	// this is used for constocter injection
	public BillCollector(IPayment payment) {
		System.out.println("BillCollector :: Param Constructor");
		this.payment = payment;
	}

	public void collectPayment(double amount) {

		System.err.println("Injectd ::" + payment.getClass().getName());

		String Status = payment.pay(amount);

		System.out.println(Status);

	}

}

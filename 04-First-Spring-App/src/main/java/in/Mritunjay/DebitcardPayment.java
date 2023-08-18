package in.Mritunjay;

public class DebitcardPayment implements IPayment{
	
	public DebitcardPayment() {
		System.out.println("DebitcardPayment ::Constructor");
	}

	
	public String pay(double amount) {
		// logic for debit card payment
		return "Payment Succesful through Debitcard";
	}

}

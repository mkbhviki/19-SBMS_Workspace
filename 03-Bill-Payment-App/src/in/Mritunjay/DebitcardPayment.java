package in.Mritunjay;

public class DebitcardPayment implements IPayment{

	@Override
	public String pay(double amount) {
		// logic for debit card payment
		return "Payment Succesful through Debitcard";
	}

}

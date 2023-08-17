package in.Mritunjay;

public class Creditcardpayment implements IPayment {

	@Override
	public String pay(double amount) {
		//logic for Creditcard payment
		return "Payment Succesful through Creditcard";
	}

}

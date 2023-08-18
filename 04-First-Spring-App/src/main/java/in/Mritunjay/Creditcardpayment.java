package in.Mritunjay;

public class Creditcardpayment implements IPayment {
	
	public Creditcardpayment() {
		System.out.println("Creditcardpayment :: Constructor");
	}

	
	public String pay(double amount) {
		//logic for Creditcard payment
		return "Payment Succesful through Creditcard";
	}

}

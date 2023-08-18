package in.Mritunjay;

public class UpiPayment implements IPayment {
	
	public UpiPayment() {
		System.out.println("UpiPayment :: Constructor");
	}

	
	public String pay(double amount) {
		// logic for Upipayment
		return "Payment Successful through Upi";
	}

}

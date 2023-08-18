package in.Mritunjay;

public class Test3 {
	public static void main(String[] args) {
		
		//dependent class obj
		Creditcardpayment creditcardpayment = new Creditcardpayment();
		
		//target class object
		BillCollector billCollector = new BillCollector();
		
		//injecting dependent cls obj into target clss obj
		billCollector.setPayment(creditcardpayment);
		
		billCollector.collectPayment(3000.25);

	}
}

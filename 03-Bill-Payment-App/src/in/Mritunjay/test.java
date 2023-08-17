package in.Mritunjay;

public class test {

	public static void main(String[] args) {

		BillCollector billCollector = new BillCollector();

		// injecting creditcard obj into BillCollector (Setter Injection)
		billCollector.setPaymrnt(new UpiPayment());
		billCollector.collectPayment(14000.25);

		// injecting creditcard obj into BillCollector (Constructor Injection)
		BillCollector billCollector2 = new BillCollector(new Creditcardpayment());

		billCollector2.collectPayment(1500.00);

	}

}

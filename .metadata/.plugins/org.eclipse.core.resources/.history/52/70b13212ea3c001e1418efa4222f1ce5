package in.Mritunjay;

import java.lang.reflect.Field;

public class test2 {

	public static void main(String[] args) throws Exception {

		Class<?> clz = Class.forName("in.Mritunjay.BillCollector");// for Field Veriable injection

		Field field = clz.getDeclaredField("payment");

		field.setAccessible(true);

		Object obj = clz.newInstance();

		field.set(obj, new DebitcardPayment());// injecting Value to Variable

		BillCollector bc = (BillCollector) obj;
		bc.collectPayment(2000.22);
	}

}

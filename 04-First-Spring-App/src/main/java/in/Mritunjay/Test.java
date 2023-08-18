package in.Mritunjay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("Spring-Bean.xml");
		
		BillCollector bean = contex.getBean("billCollector",BillCollector.class);
		bean.collectPayment(40000.20);
		
		
	}
}

package inheritanse;

public class Car extends Engine {
	
	public void drive() {
		
		int status = super.start();
		if(status >=1) {
			System.out.println("Joirney started....");
		}else {
			System.out.println("Engine having Some Problem");
		}
	}

}

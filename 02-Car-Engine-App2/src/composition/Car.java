package composition;

public class Car  {
	
	public void drive() {
		
		Engine eng = new Engine();
		int status = eng.start();
		if(status >=1) {
			System.out.println("Joirney started....");
		}else {
			System.out.println("Engine having Some Problem");
		}
	}

	

}

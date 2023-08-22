package in.Mritunjay;


public class Car {
	
	public DieselEngine dieselEngine;
	

	public void setDieselEngine(DieselEngine dieselEngine) {
		System.out.println("SetDieselEng() method executed...");
		this.dieselEngine = dieselEngine;
	}

	public Car() {
		System.out.println("Car :: O-Constructor");
	}
	
	
	
	public Car(DieselEngine dieselEngine) {
		System.out.println("Car :: 12345 Constructor");
		this.dieselEngine = dieselEngine;
	}

	public void drive() {
		int start = dieselEngine.Start();
		
		if(start>=1) {
			System.out.println("Journey Started..");
		}else {
			System.out.println("Engine failed To Start...");
		}
	}
	

}

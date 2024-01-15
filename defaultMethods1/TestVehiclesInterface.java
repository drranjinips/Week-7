package defaultMethods1;

public class TestVehiclesInterface {

	public static void main(String[] args) {
		Vehicles ref1= new Car();
		ref1.horn();
		ref1.speed();
		Vehicles ref2= new Bike();
		ref2.horn();
		ref2.speed();
		

	}

}

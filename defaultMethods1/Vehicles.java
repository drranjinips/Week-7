package defaultMethods1;

public interface Vehicles {
void horn();
default void speed() {
	System.out.println("The speed of vehicles");
}

}

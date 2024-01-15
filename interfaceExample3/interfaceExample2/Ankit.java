package interfaceExample2;
interface Arun {
	void add();
}
interface Anjan  extends Arun{
	void subtract();
	/*with this interface 
	Anjan can access both the methods add and subtract*/
}
public class Ankit implements Anjan {
public void add() {
	int a=10;
	int b=20;
	int c;
	c=a+b;
	System.out.println("The sum is  " + c);
			
}
public void subtract() {
	int a=10;
	int b=20;
	int c;
	c=a-b;
	System.out.println("The difference is  " + c);
			
}
}

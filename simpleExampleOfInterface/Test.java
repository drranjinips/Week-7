package simpleExampleOfInterface;

public class Test {

	public static void main(String[] args) {
		C obj =new C();
		A ref1;
		ref1=obj;
		ref1.show();
		/*In a similar way we can create the reference variable
for the interface B and also generate the same output. 
The below code demonstrate that*/
		B ref2;
		ref2=obj;
		ref2.show();
	}

}

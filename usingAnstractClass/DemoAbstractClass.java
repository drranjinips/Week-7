package usingAnstractClass;

class DemoAbstractClass {

	public static void main(String[] args) {
		Rectangle  objectr= new Rectangle(4,7);
		Triangle obectt=new Triangle(10,20);
		Figure refer;
		refer=objectr;
		System.out.println("The area of rectangle  is " + refer.area());
		refer=obectt;
		System.out.println("The area  of triangle is  " + refer.area());
		
			}

}

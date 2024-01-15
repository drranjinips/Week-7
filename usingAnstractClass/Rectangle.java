package usingAnstractClass;

 class Rectangle extends Figure {
	Rectangle(int a, int b){
		super(a,b);

	}
	int area() {
		//System.out.println("The area of rectangle is ");
		return dim1*dim2;
	}
	
}

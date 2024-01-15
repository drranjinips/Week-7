package usingAnstractClass;

class Triangle extends Figure {
	Triangle(int a, int b){
		super(a,b);
	}
	int area() {
		//System.out.println("The area of Triangle is ");
		return (dim1*dim2)/2;
	}

}

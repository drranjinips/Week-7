package simpleExampleOfInterface;
interface A{
	int a=20;
	void show();
}

interface B{
	int a=25;
	void show();
}
class C implements A, B
{
public int c;
public void show() {
	c=A.a + B.a;
	System.out.println(c);
	System.out.println(A.a);
	System.out.println(B.a);
}
}

package interfaceExample3;
interface customerRaj{
	int Rice=5;//This is default public + static+final
	void purchase();
	 
}
public class SellerSanju implements customerRaj {
	

	public void purchase() {
	System.out.println("The Rajs Requirement is " +Rice +" kg Rice" );
	}
}



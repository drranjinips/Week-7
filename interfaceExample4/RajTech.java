package interfaceExample4;

interface Client{
	void webdesign();
	void webdevelopment();
}
/* in the implementation class there should be both 
 the methods which are available in the interface. 
 Assume that the RajTech developer did the webdesign 
 such as green colorfor the webpage, menu icon, 
 three dots through which people can see all the chats available. 
 Assume that  RajTech developer did only the webdesign and 
 left the job.Then what client will do, 
 he will make half the payment for  webdevelopment and give  the 
 work to another developer. So webdesign method become abstract, 
 since the client don't want to invest again for
  the webdevelopment part. 
 */
abstract class RajTech implements  Client
{
	public void webdesign() {
	System.out.println("Green Color, menu on top,  on corner 3 dots ");	
	}
}	
class RahulTech extends   RajTech
{
	public void webdevelopment() {
		System.out.println("HTML ,CSS,  Java Script ");	
}
}

	


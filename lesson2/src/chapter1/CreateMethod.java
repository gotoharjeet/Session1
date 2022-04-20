package chapter1;

class CreateMethod_A
{
	public void m1()
	{
		System.out.println("CreateMethod_A");
	}
}
public class CreateMethod extends CreateMethod_A 
{
	
	
	public void m2()
	{
		System.out.println("CreateMethod");
	}
	
	
	public static void main(String[] args) {
		// Parent ref can point to parant and child object
		//but parent ref cannot call to child method
		
		CreateMethod_A ca=new CreateMethod_A();
		ca.m1();
		//ca.m2();
		CreateMethod cm=new CreateMethod();
		cm.m1();
		cm.m2();
		CreateMethod_A ca1=new CreateMethod();
		ca1.m1();
		//ca1.m2();
		
	}

}

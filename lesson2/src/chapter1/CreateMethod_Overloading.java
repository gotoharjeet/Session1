package chapter1;

public class CreateMethod_Overloading {

	public void m1()
	{
		System.out.println("m1 with no argument");
	}
	
	public void m1(int i,float f)
	{
		System.out.println("m1 method with two argument int,float");
	}
	
	public void m1(double d,int i)
	{
		System.out.println("m1 method with two argument double,int");
	}
	public static void main(String[] args) {
		
		CreateMethod_Overloading mo=new CreateMethod_Overloading();
		mo.m1();
		int i=21;
		float f=21;
		mo.m1(i, (float)i);
		mo.m1(20.0,i);
				
	}

}

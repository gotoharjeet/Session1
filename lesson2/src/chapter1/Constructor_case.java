package chapter1;

//class with default constructor
class Constructor_c1
{
	public int i=1;
}

//constructor can be protected
class Constructor_c2
{
	public int i=2;
	protected Constructor_c2()
	{
		super();
	}
}
//constructor can be default 
class Constructor_c3
{
	public int i=3;
	Constructor_c3()
	{
		super();
	}
}

//constructor can be private
class Constructor_c4
{
	public int i=4;
	private Constructor_c4()
	{
		super();
	}
}

//first line of constructor must be either super()/this();
class Constructor_c5
{
	public int i=5;
	Constructor_c5(int i)
	{
		super();
		this.i=i;
	}
}
//first line this();
class Constructor_c6
{
	public int i=6;
	Constructor_c6(int i)
	{
		this();
		this.i=i;
	}
	
	Constructor_c6()
	{
		super();
	}
}


public class Constructor_case {

	public int i;
	
	public Constructor_case()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_case cons_case=new Constructor_case();
		System.out.println("cons_case.i= "+cons_case.i);
		
		Constructor_c1 cons_c1=new Constructor_c1();
		System.out.println("cons_c1.i= "+cons_c1.i);
		
		Constructor_c2 cons_c2=new Constructor_c2();
		System.out.println("cons_c2.i= "+cons_c2.i);
		
		Constructor_c3 cons_c3=new Constructor_c3();
		System.out.println("cons_c3.i= "+cons_c3.i);
		//private const
	//	Constructor_c4 cons_c4=new Constructor_c4();
		//System.out.println("cons_c4.i= "+cons_c4.i);
		
		Constructor_c5 cons_c5=new Constructor_c5(5);
		System.out.println("cons_c5.i= "+cons_c5.i);
		
		Constructor_c6 cons_c6=new Constructor_c6(6);
		System.out.println("cons_c6.i= "+cons_c6.i);
		
		
	}

}

package chapter1;

public class Constructor_Need {
	
	//Constructor is used to perform the initialization 
	// of an object
	// Some peace of the code is executed implicitly by the jvm.
	// to perform initialization of an object. That peace of the code 
	// is called Constructor.
	// How many object we are creating based on that 
	// those many times constructor will be executed 
	//==
	//An  object is created by using the "new" keyword
	//jvm provide the default value to the instance variable of
	// that object
	
	//Constructor 
	
	
	//Student s = new Student("DurgaJi",101);
	//above statement, performing the following activities
	//1- Creating an object using new keyword(for every object,
	// 
	// new keyword creates a separate copy of the instance variables
	// and JVM assigns the default value to the instance variables);
	//2- Once the Student object is created, 
	//  the constructor job is started. Student("DurgaJi",101) is 
	//  the constructor call. Student Constructor is called,
	//   by passing "DurgaJi" and 100 as an arguments. Hence, whenever 
	//  we create an object automatically constructor execute, 
	//  to perform an initialization of an object
	//  Student(String name,int rollno)
	//  {
	//   this.name=name; current object name=null will be replaced 
	//   with name="DurgaJi"
	//   this.rollno=rollno; current object rollno=0 will replaced 
	//   with rollno=101
	//  }
	//3- declares reference variable of Student type, pointing to the
	//   Student object

	public Constructor_Need()
	{
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		Constructor_Need cons1=new Constructor_Need();
		Constructor_Need cons2=new Constructor_Need();
		Constructor_Need cons3=new Constructor_Need();
		
		
	}

}

package swithCaseQuiz;
import java.util.Scanner;


import commonFuctions.Selection_DisplayOption;
import singletonClasses.Instance_Scanner;

public class SwitchCase {
	public static int correct_count;
	public char option;
	String[] s;
	Selection_DisplayOption sop=new Selection_DisplayOption();
	Scanner obj=Instance_Scanner.getInstance_Scanner();
	
	
	public void firstProblem()
	{
		System.out.println("Which Data Type arguments are allowed to pass to the switch statement");
		System.out.println("A: byte/Byte,short/Short,int/Integer,long/Long,float/Float,char/Character,String,enum");
		System.out.println("B: byte,short,int,long,float,char,String,enum");
		System.out.println("C: byte/Byte,short/Short,int/Integer,char/Character,String,enum");
		System.out.println("D: Byte,Short,Integer,Long,Float,Character,String,enum");
		
		s=new String[4];
		sop.selDisplayOptions(s=new String[] {"A:","B:","C:","D:"});
		
		System.out.println("Please enter the option ");
		option=obj.next().charAt(0);
		if (option == 'C' || option == 'c')
		{
			System.out.println(option);
			correct_count+=20;
		}
		
	}
	
	public void secondProblem()
	{
		s=new String[2];
		System.out.println("Curli-braces are mandatory for the switch statement?");
		sop.selDisplayOptions(s=new String[] {"A:Yes","B:No"});
		
		System.out.println("Please enter the option ");
		option=obj.next().charAt(0);
		if (option == 'A' || option == 'a')
		{
			System.out.println(option);
			correct_count+=20;
		}
	}
	
	
	public void thridProblem()
	{
		s=new String[2];
		System.out.println("An empty switch statement is valid statement i.e. case and default keyword is optional");
		sop.selDisplayOptions(s=new String[] {"A:Yes","B:No"});
		
		System.out.println("Please enter the option ");
		option=obj.next().charAt(0);
		if (option == 'A' || option == 'a')
		{
			System.out.println(option);
			correct_count+=20;
		}
	}
	
	public void fourthProblem()
	{
		System.out.println("switch(x)");
		System.out.println("{");
	    String syso1="System.out.println("+"Hello"+")";
		System.out.println(syso1);	
	    System.out.println("}");
		
	    s=new String[3];
		sop.selDisplayOptions(s=new String[] {"A:Hello","B:CE:case,default,{ expected.","C:RE"});
		
		System.out.println("Please enter the option ");
		option=obj.next().charAt(0);
		if (option == 'B' || option == 'b')
		{
			System.out.println(option);
			correct_count+=20;
		}
	    
	}
	
	public void fifthProblem()
	{
			System.out.println("int x=10;");
			System.out.println("int y=20;");
			System.out.println("switch(x)");
			System.out.println("{");
		    String syso1="    case 10: System.out.println("+10+")"+";";
			System.out.println(syso1);	
			System.out.println("break;");
			String syso2="    case y: System.out.println("+20+")"+";";
			System.out.println(syso2);	
			System.out.println("break;");
		    System.out.println("}");
		    s=new String[3];
			sop.selDisplayOptions(s=new String[] {"A:10","B:CE-constant expression required.","C:RE"});
			
			System.out.println("Please enter the option ");
			option=obj.next().charAt(0);
			if (option == 'B' || option == 'b')
			{
				System.out.println(option);
				correct_count+=20;
			}
	}
	
	public void sixthProblem()
	{
			System.out.println("int x=10;");
			System.out.println("final int y=20;");
			System.out.println("switch(x)");
			System.out.println("{");
		    String syso1="    case 10: System.out.println("+10+")"+";";
			System.out.println(syso1);	
			System.out.println("break;");
			String syso2="    case y: System.out.println("+20+")"+";";
			System.out.println(syso2);	
			System.out.println("break;");
		    System.out.println("}");
		    s=new String[3];
			sop.selDisplayOptions(s=new String[] {"A:10","B:CE-constant expression required.","C:RE"});
			
			System.out.println("Please enter the option ");
			option=obj.next().charAt(0);
			if (option == 'A' || option == 'a')
			{
				System.out.println(option);
				correct_count+=20;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCase sc=new SwitchCase();
		/*sc.firstProblem();
		sc.secondProblem();
		sc.thridProblem();
		sc.fourthProblem();
		sc.fifthProblem();*/
		sc.sixthProblem();

	}

}

package ifElseQuiz;
import java.util.Scanner;

public class IfQuiz {
	public static int correct_count;
	public char option;
	public Scanner obj=new Scanner(System.in);
	
		public void firstProblem()
		{
			//First Problem

			System.out.println("int x=0");

			System.out.println("if(x)");
			System.out.println("{");
		    String syso1="System.out.println("+"Hello"+")";
			System.out.println(syso1);	
		    System.out.println("}");
			System.out.println("else");							
			System.out.println("{");				
		    String syso2="System.out.println("+"Hi"+")";
			System.out.println(syso2);
			System.out.println("}");	

			System.out.println("A:Hello   B:Hi   C:CE   D:RE");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'C' || option =='c' )
				correct_count+=20;
			
			

		}
		
		public void secondProblem()
		{
			//SECOND PROBLEM
			System.out.println("int x=10");

			System.out.println("if(x=20)");
			System.out.println("{");
		    String syso1="System.out.println("+"Hello"+")";
			System.out.println(syso1);	
		    System.out.println("}");
			System.out.println("else");							
			System.out.println("{");				
		    String syso2="System.out.println("+"Hi"+")";
			System.out.println(syso2);
			System.out.println("}");	

			System.out.println("A:Hello   B:Hi   C:CE   D:RE");
			
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'C' || option =='c')
				correct_count+=20;
			
			
		}
		
		public void thirdProblem()
		{
			//THIRD PROBLEM
		System.out.println("int x=10");

		System.out.println("if(x==10)");
		System.out.println("{");
	    String syso1="System.out.println("+"Hello"+")";
		System.out.println(syso1);	
	    System.out.println("}");
		System.out.println("else");							
		System.out.println("{");				
	    String syso2="System.out.println("+"Hi"+")";
		System.out.println(syso2);
		System.out.println("}");	

		System.out.println("A:Hello   B:Hi   C:CE   D:RE");
		option=obj.next().charAt(0);
		System.out.println("Selected Option :"+option);
		
		//check the selection
		if(option == 'A' )
			correct_count+=20;
		
		

		}
		
		public void fourthProblem()
		{
			//FOURTH PROBLEM
			System.out.println("Boolean b=true");

			System.out.println("if(b=false)");
			System.out.println("{");
		    String syso1="System.out.println("+"Hello"+")";
			System.out.println(syso1);	
		    System.out.println("}");
			System.out.println("else");							
			System.out.println("{");				
		    String syso2="System.out.println("+"Hi"+")";
			System.out.println(syso2);
			System.out.println("}");	

			System.out.println("A:Hello   B:Hi   C:CE   D:RE");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'B' )
				correct_count+=20;
			
			

		}
		
		public void fifthProblem()
		{
			//FIFTH PROBLEM
			System.out.println("boolean b=true");

			System.out.println("if(b==false)");
			System.out.println("{");
		    String syso1="System.out.println("+"Hello"+")";
			System.out.println(syso1);	
		    System.out.println("}");
			System.out.println("else");							
			System.out.println("{");				
		    String syso2="System.out.println("+"Hi"+")";
			System.out.println(syso2);
			System.out.println("}");	

			System.out.println("A:Hello   B:Hi   C:CE   D:RE");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'B' || option =='b' )
				correct_count+=20;
			
			

		}
		
		public void sixthProblem()
		{
			//Sixth Problem
			System.out.println("boolean b=false");

			System.out.println("if(b==false)");
			System.out.println("{");
		    String syso1="System.out.println("+"Hello"+")";
			System.out.println(syso1);	
		    System.out.println("}");
			System.out.println("else");							
			System.out.println("{");				
		    String syso2="System.out.println("+"Hi"+")";
			System.out.println(syso2);
			System.out.println("}");	

			System.out.println("A:Hello   B:Hi   C:CE   D:RE");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'A' || option == 'a' )
				correct_count+=20;
		}
		
		
		public void seventhProblem()
		{
			//Seventh Problem
			System.out.println("if(true)");
		    String syso1="\tSystem.out.println("+"Hello"+");";
			System.out.println(syso1+"\n");	
			
			System.out.println("A:Hello   B:Hi   C:CE   D:RE");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'A' || option == 'a' )
				correct_count+=20;
		}
		
		public void eigthProblem()
		{
			//Eighth Problem
			System.out.println("if(true);"+"\n");
		    
			System.out.println("A:Blank   B:CE   D:RE");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'A' || option == 'a' )
				correct_count+=20;
		}
		
		public void ninethProblem()
		{
			//Nineth Problem
			System.out.println("if(true)");
		    String syso1="\tint x=10;";
			System.out.println(syso1+"\n");	
			
			System.out.println("A:Blank   B:CE   C:RE D:Unreachable");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'B' || option == 'b' )
				correct_count+=20;
		}
		
		public void tenthProblem()
		{
			//Seventh Problem
			System.out.println("if(true)");
			System.out.println("{");
		    String syso1="\tint x=10;";
		    System.out.println(syso1);
		    System.out.println("}"+"\n");
				
			
			System.out.println("A:Blank   B:CE   C:RE  D:UnReachable");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'A' || option == 'a' )
				correct_count+=20;
		}
		
		public void eleventhProblem()
		{
			//eleventh Problem
			System.out.println("if(true)");
			System.out.println("   if(true)");
			String syso1="       System.out.println("+"Hello"+");";
			System.out.println(syso1);
			System.out.println("else");
			String syso2="\tSystem.out.println("+"Hi"+");";
		    System.out.println(syso2+"\n\n");
				
			
			System.out.println("A:Hello   B:CE   C:RE  D:UnReachable");
			option=obj.next().charAt(0);
			System.out.println("Selected Option :"+option);
			
			//check the selection
			if(option == 'A' || option == 'a' )
				correct_count+=20;
		}
		public static void main(String[] args) 
		{
			IfQuiz ifquiz = new IfQuiz();
			
			/*ifquiz.firstProblem();
			ifquiz.secondProblem();
			ifquiz.thirdProblem();
			ifquiz.fourthProblem();
			ifquiz.fifthProblem();
			ifquiz.sixthProblem();
			ifquiz.seventhProblem();
			ifquiz.eigthProblem();
			ifquiz.ninethProblem();
			ifquiz.tenthProblem();*/
			ifquiz.eleventhProblem();
		}
	

}

package ifElseQuiz;

import java.util.Scanner;


import commonFuctions.Selection_DisplayOption;
import singletonClasses.Instance_Scanner;
public class Try {
	public static int correct_count;
	public char option;
	String[] s;
	Selection_DisplayOption sop=new Selection_DisplayOption();
	Scanner obj=Instance_Scanner.getInstance_Scanner();
	
	public void first() {
		if(true)
			if(true)
				System.out.println("Hello");
			else
				System.out.println("Hi");
		
		System.out.println("Dangaling else");
		
		s=new String[4];
		sop.selDisplayOptions(s=new String[] {"A:Hello","B:Hi","C:CE","D:RE"});
		//if(true)
			//System.out.println("heello");
			//int x=10;
		
		System.out.println("Please enter the option ");
		option=obj.next().charAt(0);
		if (option == 'A' || option == 'a')
		{
			System.out.println(option);
			correct_count+=20;
		}
	}
	
	public void second() 
	{
		s=new String[3];
		sop.selDisplayOptions(s=new String[] {"A:Hello","B:Hi","C:CE"});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Try t=new Try();
		t.first();
		t.second();
		
		
		
	}

}

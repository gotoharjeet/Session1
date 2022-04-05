package singletonClasses;

import java.util.Scanner;

public class Instance_Scanner {
	
	private static Scanner obj;
	
	private Instance_Scanner() {}
	
	public static Scanner getInstance_Scanner()
	{
		
		if(obj == null) 
		{
			synchronized(Instance_Scanner.class)
			{
				if(obj == null)
				{
					obj=new Scanner(System.in);
				}
			}
		}
		return obj;
	}

}

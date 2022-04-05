package commonFuctions;

public class Selection_DisplayOption {
	
	public void selDisplayOptions(String[] options)
	{
		System.out.println(options.length);
		for(String opt:options)
			System.out.print(opt+"\t");
		System.out.println("\n");
	}
}

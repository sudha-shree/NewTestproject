package testpkg;

public class CallInterface implements Simpleinterface
{

	
	public void meth3()
	{
		System.out.println("This is concrete method 3");
		
	}

	public void meth4()
	{
		System.out.println("This is concrete method 4");
		
	}

	public static void main(String[]args)
	{
		CallInterface cbc= new CallInterface();
		cbc.meth3();
		cbc.meth4();
		
	}

}

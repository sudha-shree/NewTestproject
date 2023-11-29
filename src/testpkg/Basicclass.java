package testpkg;

public abstract class Basicclass 
{
	int a=39;
	public void meth1()
	{
		int a=40;
		a=70;
		
		System.out.println("This is concrete method:"+ a);
	}
	public abstract void meth2();
	
	
	
	public static void main(String[]args)
	{
		// Basicclass bc= new Basicclass();
	}
	
}

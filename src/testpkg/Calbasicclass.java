package testpkg;

public class Calbasicclass extends Basicclass
{

	
	public void meth2() 
	{
		System.out.println("This is my credential");
		
	}
	public static void main(String[]args)
	{
		Calbasicclass cbc= new Calbasicclass();
		cbc.meth1();
		cbc.meth2();
	}
	

}

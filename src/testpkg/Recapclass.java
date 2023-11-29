package testpkg;

public class Recapclass 
{
	public Recapclass(int a)
	{
		int c = a*a;
		System.out.println(c);
		System.out.println("this is a constructor");
		
	}
	public int sum(int a, int b) 
	{
		int c=a+b;
		System.out.println("sum of a and b :"+c);
		return c;
	}
	public static void main(String[] args)
	{
		Recapclass rp = new Recapclass(20);
		rp.sum(10,20);
		
		
		
		
	}

	
	
	
	
	
}

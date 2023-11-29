package testpkg;

 public class Calculations 
 {
	    public Calculations(int a, int b)
	    {
	    	System.out.println("this is a constructor");
	    	int c=a+b;
	    	System.out.println(c);
	    }
		
	
	public float printval()
	{
	    int a=50;
		float b = 30.5f;
		float c = a+b;
		System.out.println("sum of a and b : " + c);
		return c;
		
	}
	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println("sum of a and b : " + c);
		return c;
	}
	
	 
	
	 
    public static void main(String[]args)
    {
    	Calculations cal = new Calculations(30,40);
    	cal.printval();
    	int x= cal.sum(10, 20);
    	cal.sum(x, 30);
    //	cal.printtext();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

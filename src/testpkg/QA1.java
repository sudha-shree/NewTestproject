package testpkg;

public class QA1 
{
	
	int a =20;
    public void printvar()	
	{
	    int a=30;
		a=50;
		System.out.println(a);
		System.out.println(this.a);
		
		
	}
	
	
	public  void sum(int a, int b)
	
	
	{
		int c = a+b;
		System.out.println("sum of a and B :"+c);
		
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a and B :"+d);
		
	}
	public void sum(float a, int b)
	{
		float c = a+b;
		System.out.println("sum of a and B :"+c);
		
	}
	
	
	public static void main(String[]args)
	{
		QA1 q1 = new QA1();
		q1.sum(10,20);
		q1.sum(10,20,30);
		q1.sum(10.5f,20);
		q1.printvar();
		
		//q1.sum(10.5,20);
		
				
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
}

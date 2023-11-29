package testpkg;

public class QA2 extends QA1

{
	int a =200;
	public void printvar()	
	{
	    int a=30;
		a=50;
		System.out.println(a);
		System.out.println(super.a);
		super.sum(20, 30);
	}
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a and B :"+c);
		
	}
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a and B :"+c);
				
	}
	
	public void sum(float a, int b)
	{
		float c = a+b;
		System.out.println("sum of a and B :"+ c);
		
	}
	public static void main(String[]args)
	{
		
	QA2 q2 = new QA2();
	
	
	  q2.sub(20,10);
	  q2.sum(10.5f,20);
	  q2.sum(20,10);
	  q2.printvar();
		
				
	}
	
	public void methQA1I() 
	{
		
		System.out.println("This is method QA1");
	}
	
}

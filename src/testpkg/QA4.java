package testpkg;

public class QA4 extends QA2 implements QA3I
{
	
	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("div of a and B :"+c);
				
	}
	public static void main(String[]args)
	{
		
	QA4 q4 = new QA4();
	
	
	  q4.sub(20,10);
	  q4.sum(10,20);
	// q4.mul(10,20);
	  q4.div(30,15);
	  q4.methQA1I();
	  q4.methQA3I();
		
				
	}
	
	public void methQA3I() 
	{
		System.out.println("This is an Interface QA3");
		
	}
	
	public void methQA1I() 
	{
		System.out.println("This is an Interface QA1");
		
	}
	
}

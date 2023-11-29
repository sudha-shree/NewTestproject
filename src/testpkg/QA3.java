package testpkg;

public class QA3 extends QA2
{
	
	
	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("mul of a and B :"+c);
				
	}
	public static void main(String[]args)
	{
		
	QA3 q3 = new QA3();
	
	
	  q3.sub(20,10);
	  q3.sum(10,20);
	  q3.mul(10,20);
		
				
	}
	
}

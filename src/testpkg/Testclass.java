package testpkg;

public class Testclass 
{
 int a=10;
 float b= 10.5f;
 char c= 'X';
 String d= "java";
 boolean e=true;

public void printvar()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	
}
public static void main(String[] args)
{
	Testclass abc = new Testclass();
	System.out.println(abc.a);
	abc.printvar();
}

	
			
	// TODO Auto-generated method stub

}

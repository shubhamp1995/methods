package methodspkg;

public class T1 

{

	public static void main(String[] args) 
	{
		System.out.println("hello");
		T1 tittu=new T1();
		tittu.abhishek();
		
myname();
T2.shubh();
	}
	
	public static void myname()
	{
		System.out.println("Static regular method myname  called from same");
	}
	
	public void abhishek() 
	{
	System.out.println("non static method called from same class");	
	}
	
	
}


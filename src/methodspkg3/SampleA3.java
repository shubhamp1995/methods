package methodspkg3;

public class SampleA3 
{
public static void main(String[] args)  
{
System.out.println("college student information" );
System.out.println("----------------------------");
m1(6,4);
m1(7,8);
m2("shubham","petkar");
		SampleA4 natha=new SampleA4();
		natha.m3("abhshek",98.5f, 101,'A');
		
}
// static regular method with int parameter
public static void m1(int a, int b) 
{
	System.out.println("addition of two number="+(a+b));
}
//static regular method with string parametr
public static void m2(String fname, String lname) 
{
	System.out.println("student name="+fname+" "+lname);
}

}

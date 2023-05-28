package methodspkg2;

public class SampleA1 
{
public static void main(String[] args)
{
System.out.println("college student information");
System.out.println("-----------------------------");

SampleA2 natha3=new SampleA2(); // object creation for diff class in order to call non- static regular method with all paramter
                                 // syntax:- diffClassname objectname=new diffclassname();
natha3.allpara("manish", 1111, 98.5f, 'a'); //callmethod syntax:- objectname.methodname();
m1(2,4);
m1(5,7);
studentname("shubham" ,"petkar");//static regular method called from same class with string paramters

SampleA2.studentinfo(4,50);  //static regular method called from diff class with int paramters
SampleA1 natha2=new SampleA1();  // object creation for same class in order to call non static regular method with int paramter
natha2.m2(40, 50);


SampleA2 natha=new SampleA2(); // object creation for diff class in order to call non static regular method with int paramter
natha.information(9,7);

}
// static regular method with int parameter
public static void m1(int B, int C) 
{
	System.out.println(B*C);
	System.out.println(B+C);
}
// static regular method with string paramters
public static void studentname(String fname, String lname)
{
System.out.println("studentname="+fname+" "+lname);	
}
//non-static regular method with int paramters
public void m2(int n, int m) 
{
	System.out.println("multiplication of two num="+(m*n));
}
}

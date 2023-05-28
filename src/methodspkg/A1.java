package methodspkg; //pkg name

public class A1 //class declaration
{
public static void main(String[] args) // pre defined method
{
alpha();  // methodname();
alpha();	
alpha2();
A2.alpha3(); // diffclassname.methodsname();

A1 shubhu=new A1(); //classname objectname=new classname(); // object creation of same class
shubhu.beta1();

A2 shubhu2= new A2(); //diffclassname object name=new diff classname(); //object creation of diff class 
shubhu2.beta2();    //diffclassname.methodsname();

System.out.println("hello");
}
//static regular method 
public static void alpha() //user defined method

{
System.out.println("staic regular method alpha called from the same class");
}

public static void alpha2() 
{
System.out.println("Static regular method alpha2 called from the same class");
}
// non-static regular method
public void beta1() 
{
	System.out.println("non-static regular method beta1 called from the same class");
}




}

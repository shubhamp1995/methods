package methodspkg;

public class p1 {

	public static void main(String[] args) {
		m1();
		p1 p11=new p1();
		p11.m2();
		System.out.println("\n");
		p2.m3();
		p2 p12=new p2();
		p12.m4();
	}
	
	public static void m1() {
		System.out.println("Static regular method call from same class");
	}
	public void m2() {
		System.out.println("non-static method call from same class");
	}
	
	
}

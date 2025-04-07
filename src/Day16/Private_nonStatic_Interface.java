package Day16;

public class Private_nonStatic_Interface implements P1 {

	public static void main(String[] args) {

		Private_nonStatic_Interface p = new Private_nonStatic_Interface();
		p.m1();
		P1.main(args);
	}
}

interface P1 {
	default void m1() {
		System.out.println("P1 interface");
		privateMethod();
	}

	private void privateMethod() {
		System.out.println("Private non static method");
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String args[]) {
		System.out.println(add(1,2));
	}
}

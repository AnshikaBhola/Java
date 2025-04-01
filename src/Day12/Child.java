package Day12;

public class Child extends Parent {

	// for static
//	static {
//		System.out.println("Child class - static block");
//	}
//
//	public static void main(String[] args) {
//		System.out.println(m);
//        m1();
//	}

	// for non-static

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.m);
		ch.m1 ();
	}
}

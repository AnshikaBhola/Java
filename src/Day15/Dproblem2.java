package Day15;

//this is the actual diamond problem
public class Dproblem2 implements P3, P4 {

	public void m1() {
		P4.super.m1();
	}

	public static void main(String[] args) {
		System.out.println(P3.k );
		System.out.println(P4.k);
		P3 d = new Dproblem2();
		d.m1();
	}
}

interface P3 {
	int k = 10;

	default void m1() {
		System.out.println("P1 interface");
	}
}

interface P4 {
	int k = 20;

	default void m1() {
		System.out.println("P2 interface");
	}
}

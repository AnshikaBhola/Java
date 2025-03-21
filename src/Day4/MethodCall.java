package Day4;

public class MethodCall {

	public static void main(String[] args) {
		m1();
	}
	public static void m1() {
		System.out.println("M1 start");
		m2();
		System.out.println("M1 end");
	}
	public static void m2() {
		System.out.println("M2 start");
		m3();
		System.out.println("M2 end");
	}
	public static void m3() {
		System.out.println("M3 start");
		System.out.println("M3 end");
	}

}

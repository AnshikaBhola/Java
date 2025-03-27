package Day9;

public class Static_class_overloading {
	static int a = 10;
	static {
		System.out.println("static block 1");
	}

	public static void main(String[] args) {
		System.out.println("Main start");
		System.out.println(a);
		System.out.println("Main end");

	}

	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}

}

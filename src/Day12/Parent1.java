package Day12;

public class Parent1 {
	static int a = 10;
	int b = 20;
	static {
		System.out.println("parent class static block");
	}
	{
		System.out.println("parent class non static block");
	}

	Parent1() {
		System.out.println("parent class constructor");
	}

	public static void m1() {
		System.out.println("parent class static method");
	}

	public void m2() {
		System.out.println("parent class non static method");
	}

}

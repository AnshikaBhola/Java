package Day12;

public class Parent {
// for static 	
//	static int m=200;
//	
//	static {
//		System.out.println("Parent class-static block");
//	}
//	
//	public static void m1() {
//		System.out.println("Parent class");
//	}

	// for non-static
	int m = 200;

	{
		System.out.println("Parent class-static block");
	}

	public void m1() {
		System.out.println("Parent class");
	}
}

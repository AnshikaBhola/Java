package Day15;

public interface IntroToInterface {

	int a = 20;

	default void m1() {
		System.out.println("default method");
	}

	public static void main(String[] args) {
		System.out.println("Interface");
	}
}

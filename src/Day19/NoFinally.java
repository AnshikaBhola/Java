package Day19;

public class NoFinally {

	public static void main(String[] args) {
		Car c = null;
		System.out.println("Start");
		try {
			System.out.println(c.price);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.exit(0); // static method
		} finally {
			System.out.println("End");
		}

	}

}

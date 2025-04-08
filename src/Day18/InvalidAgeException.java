package Day18;

public class InvalidAgeException extends RuntimeException {

	public InvalidAgeException() {
		super("Age is less than 18");
	}

}

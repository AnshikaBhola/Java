package Day21;

public class ListOutOfBoundsException extends IndexOutOfBoundsException {
	public ListOutOfBoundsException() {
		super("Index is not present");
	}
}

package Day20;

public class ListOutOfBoundsException extends IndexOutOfBoundsException {
	public ListOutOfBoundsException() {
		super("Index is not present");
	}
}

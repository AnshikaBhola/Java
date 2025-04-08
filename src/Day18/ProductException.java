package Day18;

public class ProductException extends RuntimeException {

	public ProductException() {
		super("Price is negative");
	}

}

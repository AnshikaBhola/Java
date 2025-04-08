package Day18;

//import java.util.Scanner;

public class Product {

	String type;
	int price;
	public Product(String type, int price) {
//		super();
		this.type = type;
		this.price = price;
	}
	public void display()
	{
		System.out.println(this.type);
		System.out.println(this.price);
	}

}

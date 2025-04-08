package Day18;

import java.util.*;

public class ProductDriver {

	public static void main(String[] args) {

		String type = getType();
		int price = getPrice();
		
		try {
			if(price<0)
				throw new ProductException();
		}
		catch(ProductException e)
		{
			System.out.println(e.getMessage());
			price = getPrice();
		}
		finally
		{
			Product p1 = new Product(type, price);
			p1.display();
		}
	}
	
	public static String getType()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type");
		String type = sc.next();
		return type;
	}
	public static int getPrice()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price");
		int price = sc.nextInt();
		return price;
	}
}

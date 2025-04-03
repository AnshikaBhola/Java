package Day14;

public class Country_driver {

	public static void main(String[] args) {
		Country c = new Country("India", 28, 8, "Pakistan");
		Country c1 = new Country("India", 28, 8, "Pakistan");
		System.out.println(c==c1);
		System.out.println(c.equals(c1));
//		System.out.println(c);
//		System.out.println(c1);

	}

}

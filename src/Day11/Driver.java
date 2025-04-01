package Day11;

public class Driver {

	public static void main(String[] args) {
		Engine engine = new Engine(4, "100HP", "hybrid");
		Car c1 = new Car("TATA", engine);
		System.out.println(c1.getBrand());
//		System.out.println(c1.getEngine().getPower());
//		System.out.println(c1.tyres[0].brand);
//		System.out.println(c1.tyres[1]);
//		System.out.println(c1.tyres[2]);
//		System.out.println(c1.tyres[3]);
		
		c1.getMirror();
		System.out.println(c1.mirrors[0]);

	}
}

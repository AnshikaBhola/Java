package Day16;

public class CarDriver {

	public static void main(String[] args) throws CloneNotSupportedException {

		Car c1 = new Car(12000, new Engine("100HP"));
		Car c2 = (Car) c1.clone();
		c2.eng.power = "20HP";
		System.out.println(c1.eng.power);
		System.out.println(c2.eng.power);
	}
}

 package Day12;

import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sedan");
		System.out.println("2. Auto");
		System.out.println("3. Bike");
		int type = sc.nextInt();
		Cab cab = null;

		switch (type) {
		case 1: {
			cab = new Sedan("Sedan");
		}
			break;
		case 2: {
			cab = new Auto("Auto");
		}
			break;
		case 3: {
			cab = new Bike("Bike");
		}
			break;
		default:
			System.out.println("Unexpected value: " + type);
		}

		if (cab instanceof Auto) {
			Auto a = (Auto) cab;
			System.out.println(a.type);
			System.out.println(a.price);
		} else if (cab instanceof Sedan) {
			Sedan a = (Sedan) cab;
			System.out.println(a.type);
			System.out.println(a.price);
		} else if (cab instanceof Bike) {
			Bike a = (Bike) cab;
			System.out.println(a.type);
			System.out.println(a.price);
		}

		sc.close();

	}
}

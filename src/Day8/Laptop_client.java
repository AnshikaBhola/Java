package Day8;
   
public class Laptop_client {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("pavilion", "hp", "amd", 11);
		l1.printData();
		System.out.println();

		Laptop l2 = new Laptop("victus", "hp", "intel");
		l2.printData();
	}

}

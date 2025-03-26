package Day8;

public class Laptop {

	String name;
	String brand;
	String processor;
	int windows;

	Laptop(String name, String brand, String processor, int windows) {
		this.name = name;
		this.brand = brand;
		this.processor = processor;
		this.windows = windows;
	}

	Laptop(String name, String brand, String processor) {
		this.name = name;
		this.brand = brand;
		this.processor = processor;
	}

	Laptop(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}

	Laptop(String name) {
		this.name = name;
	}

	void printData() {
		if (this.name != null)
			System.out.println("Name: " + this.name);
		if (this.brand != null)
			System.out.println("Brand: " + this.brand);
		if (this.processor != null)
			System.out.println("Processor: " + this.processor);
		if (this.windows != 0)
			System.out.println("Windows: " + this.windows);

	}
}

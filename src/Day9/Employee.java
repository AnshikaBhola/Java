package Day9;

public class Employee {

	String name;
	int age;
	String email;
	int doj;
	int phone;

	Employee(String name) {
		this.name = name;
	}

	Employee(String name, int age) {
		this(name);
		this.age = age;
	}

	Employee(String name, int age, String email) {
		this(name, age);
		this.email = email;
	}

	Employee(String name, int age, String email, int doj) {
		this(name, age, email);
		this.doj = doj;
	}

	Employee(String name, int age, String email, int doj, int phone) {
		this(name, age, email, doj);
		this.phone = phone;
	}

	void print() {
		if (this.name != null)
			System.out.println("Name: " + this.name);
		if (this.age != 0)
			System.out.println("Age: " + this.age);
		if (this.email != null)
			System.out.println("E-mail: " + this.email);
		if (this.doj != 0)
			System.out.println("Date of joining: " + this.doj);
		if (this.phone != 0)
			System.out.println("Phone number: " + this.phone);
	}

}

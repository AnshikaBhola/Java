package Day9;

public class Employee_driver {

	public static void main(String[] args) {

		Employee e1 = new Employee("Anshika");
		e1.print();
		System.out.println("=============================");
		Employee e2 = new Employee("Anshika", 22);
		e2.print();
		System.out.println("=============================");
		Employee e3 = new Employee("Anshika", 22, "ans@gmail.com");
		e3.print();
		System.out.println("=============================");
		Employee e4 = new Employee("Anshika", 22, "ans@gmail.com", 01042025);
		e4.print();
		System.out.println("=============================");
		Employee e5 = new Employee("Anshika", 22, "ans@gmail.com", 01042025, 1234567890);
		e5.print();

	}

}

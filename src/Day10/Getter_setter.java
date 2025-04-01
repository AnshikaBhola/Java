package Day10;

public class Getter_setter {

	private int age;
	private String name;

	private Getter_setter(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public static Getter_setter getItsObject(String name, int age) {
		return new Getter_setter(name, age);
	}

}

package Day10;

public class Client_getter {

	public static void main(String[] args) {
		Getter_setter ob = Getter_setter.getItsObject("Anant", 22);
		System.out.println(ob.getName());
		System.out.println(ob.getAge());
		ob.setName("Bhola");
		ob.setAge(10);
		System.out.println(ob.getName());
		System.out.println(ob.getAge());

	}

}

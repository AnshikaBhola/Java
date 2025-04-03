package Day14;

public class Child_methodOverriding extends Parent_methodOverriding {
	String name="bhola";
	public void marry() {
		System.out.println("marry leela");
	}

	public static void main(String[] args) {
		Parent_methodOverriding p = new Child_methodOverriding();
		System.out.println(p.name);
		p.marry();

	}

}

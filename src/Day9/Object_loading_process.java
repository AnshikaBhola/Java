package Day9;

public class Object_loading_process {
	int a = 0;
	{
		System.out.println("Non static block 1");
	}

	Object_loading_process() {
		System.out.println("constructor");
	}

	{
		System.out.println("Non static block 2");
	}

	public void m1() {
		System.out.println("Non static method");
	}

}

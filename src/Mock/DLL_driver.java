package Mock;

public class DLL_driver {

	public static void main(String[] args) {
		DLL list=new DLL();
		list.addAtIndex(0, 10);
		System.out.println(list);
		list.removeAtIndex(0);
		System.out.println(list);

	}

}

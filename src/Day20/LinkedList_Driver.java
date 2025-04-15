package Day20;

public class LinkedList_Driver {

	public static void main(String[] args) {
		LinkedList_Intro list = new LinkedList_Intro();

		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(40);
		list.addAtIndex(2, 70);
		System.out.println(list);
		list.removeAt(2);
		System.out.println(list);
		System.out.println(list.get(2));
//		System.out.println(list.contains(10));
		
		

	}
}

package Day22;

public class CDLinkedList_Driver {

	public static void main(String[] args) {
		CDLinked_List list = new CDLinked_List();
		list.append(20);
		list.append(30);
		list.append(40);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.append(50);
		list.append(60);
		list.removeLast();
		System.out.println(list);

	}

}

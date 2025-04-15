package Day22;

public class CSL_Driver {

	public static void main(String[] args) {
		CSLinkedList list = new CSLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.prepend(1);
		list.prepend(2);

		System.out.println(list);
		System.out.println(list.size());
		list.removeFirst();
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.size());

	}

}

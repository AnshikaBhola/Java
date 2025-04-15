package Day21;

public class DoublyLinkedList_Driver {

	public static void main(String[] args) {
		DoublyLinkedList_Intro dlist = new DoublyLinkedList_Intro();
		dlist.addLast(10);
		dlist.addLast(20);
		dlist.addLast(30);
		dlist.addFirst(1);
		dlist.addFirst(2);
		dlist.addAtIndex(2, 50);
		System.out.println(dlist);
		dlist.removeAtIndex(2); 
		System.out.println(dlist);

	}

}

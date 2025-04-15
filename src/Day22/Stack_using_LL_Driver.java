package Day22;

public class Stack_using_LL_Driver {

	public static void main(String[] args) {
		Stack_using_LinkedList list = new Stack_using_LinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.print();
		list.pop();
		list.print();
		System.out.println(list.peek());
		System.out.println(list.size());

	}

}

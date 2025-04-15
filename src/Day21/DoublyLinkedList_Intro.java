package Day21;

public class DoublyLinkedList_Intro {

	Node head;
	int size;

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			size++;
			return;
		}
		head.previous = newNode;
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		newNode.previous = current;
		size++;
	}

	public void addAtIndex(int index, int data) {

		if (index == 0) {
			addFirst(data);
			return;
		}
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		if (index == size) {
			addLast(data);
			return;
		}
		if (index > size || index < 0) {
			throw new ListOutOfBoundsException();
		}
		int counter = 0;
		Node current = head;
		Node newNode = new Node(data);
		while (counter < index) {
			current = current.next;
			counter++;
		}
		current.previous.next = newNode;
		newNode.previous = current.previous;
		current.previous = newNode;
		newNode.next = current;
		size++;
	}

	public boolean removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		head = head.next;
		head.previous = null;
		size--;
		return true;

	}

	public boolean removeLast() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.previous.next = null;
		current.previous = null;
		size--;
		return true;
	}

	public boolean removeAtIndex(int index) {
		if (index == 0) {
			removeFirst();
			return true;
		}
		if (isEmpty()) {
			System.out.println("List is empty");
			return false;
		}
		if (index == size-1) {
			removeLast();
			return true;
		}
		if (index > size-1 || index < 0) {
			throw new ListOutOfBoundsException();
		}
		int counter = 0;
		Node current = head;
		while (counter < index) {
			current = current.next;
			counter++;
		}
		current.next.previous = current.previous;
		current.previous.next = current.next;
		current.previous = null;
		current.next = null;
		size--;
		return true;
	}

	public Node reverse() {
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		String data = "[";
		Node current = head;
		while (current.next != null) {
			data += current.data + ",";
			current = current.next;
		}
		data += current.data + "]";
		return data;
	}

}

class Node {
	int data;
	Node next;
	Node previous;

	Node(int data) {
		this.data = data;
	}
}

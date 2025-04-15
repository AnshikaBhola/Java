package Mock;

public class DLL {

	private class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

	Node head;
	private int size;

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void append(int data) {
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
		newNode.prev = current;
		size++;
	}

	public void prepend(int data) {
		if (isEmpty()) {
			append(data);
			return;
		}
		Node newNode = new Node(data);
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		size++;
	}

	public void addAtIndex(int index, int data) {

		if (index == 0 && isEmpty()) {
			append(data);
			return;
		}
		if (index == size + 1) {
			append(data);
			return;
		}
		if (index > size || index < 0) {
			System.out.println("index invalid");
			return;
		}
		Node current = head;
		Node newNode = new Node(data);
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		current.prev.next = newNode;
		newNode.prev = current.prev;
		current.prev = newNode;
		newNode.next = current;
		size++;
	}

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		if (size == 1) {
			head = null;
			return;
		}
		head = head.next;
		head.prev = null;
		size--;
		return;

	}

	public void removeLast() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		if (size == 1) {
			head = null;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.prev.next = null;
		current.prev = null;
		size--;
		return;
	}

	public void removeAtIndex(int index) {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		if (index == 0 && size == 1) {
			head = null;
			size--;
			return;
		}
		if (index > size - 1 || index < 0) {
			System.out.println("Invalid index");
			return;
		}
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		current.next.prev = current.prev;
		current.prev.next = current.next;
		current.prev = null;
		current.next = null;
		size--;
		return;
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

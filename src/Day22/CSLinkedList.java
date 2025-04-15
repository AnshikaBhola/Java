package Day22;

public class CSLinkedList {

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	Node head;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = newNode;
			head.next = head;
			size++;
			return;
		}
		Node current = head;
		while (current.next != head) {
			current = current.next;
		}
		current.next = newNode;
		newNode.next = head;
		size++;
	}

	public void prepend(int data) {
		if (isEmpty()) {
			append(data);
			return;
		}
		Node newNode = new Node(data);
		Node current = head;
		while (current.next != head) {
			current = current.next;
		}
		newNode.next = head;
		current.next = newNode;
		head = newNode;
		size++;
	}

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		while (current.next != head) {
			current = current.next;
		}
		head = head.next;
		current.next = head;
		size--;
	}

	public void removeLast() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		if (size == 1) {
			head = null;
			size--;
			return;
		}
		Node current = head;
		while (current.next.next != head) {
			current = current.next;
		}
		current.next.next = null;
		current.next = head;
		size--;

	}

	public String toString() {
		if (isEmpty()) {
			return "[ ]";
		}
		StringBuffer data = new StringBuffer("[");
		Node current = head;
		while (current.next != head) {
			data.append(current.data + "-->");
			current = current.next;
		}
		data.append(current.data + "]");
		return data.toString();
	}

}

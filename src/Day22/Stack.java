package Day22;

import java.util.EmptyStackException;

public class Stack {

	private int stack[];
	private int top;

	public Stack(int size) {
		stack = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int data) {
		if (top == stack.length - 1) {
			throw new StackOutOfMemory();
		}
		stack[++top] = data;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top--];
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top];
	}

	public int size() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top+1;
	}
	
	public void print() {
		for (int i = top; i >= 0; i--) {
			System.out.println("|| " + stack[i] + " ||");
		}
		System.out.println("=========");
	}
}

class StackOutOfMemory extends Error {
	public StackOutOfMemory() {
		super("Stack is full");
	}
}

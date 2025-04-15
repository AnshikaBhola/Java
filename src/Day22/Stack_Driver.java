package Day22;

public class Stack_Driver {

	public static void main(String[] args) {
		Stack s=new Stack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
        s.print();
        System.out.println(s.pop());
        s.print();

	}

}

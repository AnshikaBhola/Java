package Day14;

public class Child_castException extends Parent_castException{
	public static void main(String [] args) {
		Parent_castException p=new Parent_castException();
		System.out.println(p);
		Child_castException ch=(Child_castException)p;
		System.out.println(ch);
	}

}

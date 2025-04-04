package Day15;

public class Diamondproblem implements P1, P2 {

	public static void main(String[] args) {
		System.out.println(P1.k);
//		print(); it is not getting inherited,the problem here is not ambiguity
		P1.print();
		P2.print();

	}

}

interface P1 {
	int k = 10;

	public static void print() {
		System.out.println("P1 interface");
	}
}

interface P2 {
	int k = 20;

	public static void print() {
		System.out.println("P2 interface");
	}
}

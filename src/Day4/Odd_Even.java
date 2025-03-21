package Day4;

public class Odd_Even {

	public static void main(String[] args) {
		System.out.println(oddEven(7));

	}
    public static String oddEven(int n) {
    	return (n%2==0)?"Even":"Odd";
    }
}

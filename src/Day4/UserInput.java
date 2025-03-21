package Day4;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(n);
        System.out.println("Enter a double number");
        Double d=sc.nextDouble();
        System.out.println(d);
        System.out.println("Enter a boolean");
        boolean b=sc.nextBoolean();
        System.out.println(b);
        sc.close();
	}

}
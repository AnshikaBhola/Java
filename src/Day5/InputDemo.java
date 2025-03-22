package Day5;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter name");
//		String name=sc.next();
		sc.nextLine();//carrage will be send to this
		String name=sc.nextLine(); // this will take input
		System.out.println("Age : "+ age);
		System.out.println("Name : "+ name);
        sc.close();
	}

}

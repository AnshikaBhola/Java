package Day5;

import java.util.Scanner;

public class next_hasNext {

	public static void main(String[] args) {
		String str="10:20:30";
		Scanner sc=new Scanner(str);
		sc.useDelimiter(":"); 
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		System.out.println(sc.next());
		System.out.println(sc.hasNext());
		sc.close();
		
	}

}

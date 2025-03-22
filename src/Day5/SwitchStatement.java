package Day5;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		2 sc = new Scanner(System.in);
		System.out.println("Enter First Input:");
		int a = sc.nextInt();
		switch(a) {
		case 1:{
			
			System.out.println("case block 1");
			
		}
		break;
		case 2:{
			System.out.println("case block 2");
		}
		break;
		case 3:{
			System.out.println("case block 3");
		}
		break;
		default :{
			System.out.println("case block 4");
		}
		
		}
	}

}

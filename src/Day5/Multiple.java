package Day5;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(mul(a,b));
		sc.close();

	}
	public static int mul(int a,int b) {
		if(a==0 || b==0) {
			return 3;
		}
		//a is multiple of b 
		else if(a%b==0) {
			return 2;
		}
		else {
			return 1;
		}
	}

}

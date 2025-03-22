package Day5;

import java.util.Scanner;

public class EvenProblem_IfElseLadder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//3 even
		if(a%2==0 && b%2==0 && c%2==0) {
			System.out.println(a*b*c);
		}
		//2 even
		else
        if(a%2==0 && b%2==0) {
        	System.out.println(a+b);
        }
        else
        if(a%2==0 && c%2==0) {
        	System.out.println(a+c);
        }
        else
        if(b%2==0 && c%2==0) {
        	System.out.println(b+c);
        }
        //1 even
        else
        if(a%2==0) {
			System.out.println(a);
		}
        else
        if(b%2==0) {
			System.out.println(b);
		}
        else
        if(c%2==0) {
			System.out.println(c);
		}
        // 0 even
        else{
			System.out.println(0);
		}
        sc.close();
	}
}

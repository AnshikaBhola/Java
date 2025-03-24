package Day6;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fact(n);
		sc.close();

	}
    public static void fact(int n) {
    	System.out.println(1);
    	int i=2;
    	int c=2;
    	while(i<=n/2) {
    		if(n%i==0) {
    			System.out.println(i);
    			c++;
    		}
    		i++;
    	}
    	System.out.println(n);
    	System.out.println("Total factors: "+c);
    	
    }
}

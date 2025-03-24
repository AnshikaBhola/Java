package Day6;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkPrime(n);
		sc.close();

	}
    
	public static void checkPrime(int n) {
    	int i=2;
    	int c=0;
    	while(i<=n/2) {
    		if(n%i==0) {
    			c++;
    		}
    		i++;
    	}
        if(c==0) {
        	System.out.println(n+ " is prime number");
        }
        else {
        	System.out.println(n+ " is not prime number");
        }
    }
}

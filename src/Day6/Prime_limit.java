package Day6;

import java.util.Scanner;

public class Prime_limit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ll=sc.nextInt();
		int ul=sc.nextInt();
		prime(ll,ul);
		sc.close();

	}
	
	public static void prime(int ll,int ul) {
		for(int i=ll;i<=ul;i++) {
			int j=2;
	    	int c=0;
	    	while(j<=i/2) {
	    		if(i%j==0) {
	    			c++;
	    		}
	    		j++;
	    	}
	        if(c==0) {
	        	System.out.println(i);
	        }
		}
	}

}

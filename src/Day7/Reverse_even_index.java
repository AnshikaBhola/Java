package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_even_index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next();
		}
		reverse_evenIndex(a);
        sc.close();
	}
	
	public static void reverse_evenIndex(String a[]) {
		int i=0;
		int j=0;
		if(a.length%2==0) {
		    j=a.length-2;
		}else {
			j=a.length-1;
		}
		
		while(i<j) {
			if(i%2==0 && j%2==0) {
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;	
			}
            i++;
            j--;
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}

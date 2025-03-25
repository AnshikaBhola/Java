package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_firstHalf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.next();
		}
		reverse_first_half(a);
        sc.close();
	}
 
	public static void reverse_first_half(String a[]) {
		int i=0;
		int j=a.length/2-1;
		while(i<j) {
			String temp=a[i];
			a[i]=a[j];
			a[j]=temp;
            i++;
            j--;
		}
		System.out.println(Arrays.toString(a));
	}

}

package Day7;

import java.util.Arrays;
//import java.util.Scanner;

public class Count_occurence {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//		}
		int a[] = { 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5 };
		Arrays.sort(a);
		count(a);
//		sc.close();
	}

	public static void count(int a[]) {
		for(int i=0;i<a.length;i++) {
			int f=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					f++;
					a[j]=Integer.MIN_VALUE;
				}
				
			}
			if(a[i]!=Integer.MIN_VALUE) {
				System.out.println(a[i]+" : "+f);
			}
		}

	}

}

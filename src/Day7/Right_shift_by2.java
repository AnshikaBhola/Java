package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Right_shift_by2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int i=2;
		while(--i>0) {
			a=rightShift(a);
		}
		System.out.println(Arrays.toString(rightShift(a)));
		sc.close();
	}
	
	public static int[] rightShift(int a[]) {
		int l=a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=l;
		return a;
	}

}

package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_odd_with_immediateEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next();
		}
		reverse_odd_even(a);
		sc.close();
	}

	public static void reverse_odd_even(String a[]) {
		int i = 1;
		while (i < a.length - 1) {
			String temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
			i += 2;
		}
		System.out.println(Arrays.toString(a));
	}

}

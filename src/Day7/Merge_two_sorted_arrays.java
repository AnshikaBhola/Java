package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_two_sorted_arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a[] = new int[n1];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int b[] = new int[n2];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sc.close();

	}

	public static int[] merge_twosorted_arrays(int a1[], int a2[]) {
		int n = a1.length;
		int m = a2.length;
		int i = 0, j = 0, k = 0;
		int ans[] = new int[n + m];
		while (i < n && j < m) {
			if (a1[i] < a2[j]) {
				ans[k] = a1[i];
				i++;
				k++;
			} else {
				ans[k] = a2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = a1[i];
			i++;
			k++;
		}
		while (j < m) {
			ans[k] = a2[j];
			j++;
			k++;
		}
		return ans;
	}
}

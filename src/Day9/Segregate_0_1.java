package Day9;

import java.util.*;

public class Segregate_0_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		segregate(a);
		sc.close();
	}

	public static void segregate(int a[]) {
		int zero = 0;
		int one = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zero++;
			} else {
				one++;
			}
		}
		int i = 0;
		while (one-- > 0) {
			a[i] = 1;
			i++;
		}
		while (zero-- > 0) {
			a[i] = 0;
			i++;
		}
		System.out.println(Arrays.toString(a));
	}

}

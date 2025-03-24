package Day6;

import java.util.Scanner;

public class Total_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(total(n));
		sc.close();
	}

	public static int total(int n) {
		int ans = n;
		while (ans > 9) {
			int sum = 0;
			while (ans != 0) {
				sum += ans % 10;
				ans /= 10;
			}
			ans=sum;
		}
		return ans;

	}
}

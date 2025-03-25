package Day7;

import java.util.Scanner;

public class Read_evenIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		evenIndex_print(arr);
        sc.close();
	}
	public static void evenIndex_print(int a[]) {
		for(int i=0;i<a.length;i+=2) {
			System.out.println(a[i]);
		}
	}

}

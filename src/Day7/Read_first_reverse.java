package Day7;

import java.util.Scanner;

public class Read_first_reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		reverse_first_print(arr);
        sc.close();
	}
	public static void reverse_first_print(int a[]) {
		for(int i=a.length/2-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}

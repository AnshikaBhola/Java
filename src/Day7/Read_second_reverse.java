package Day7;

import java.util.Scanner;

public class Read_second_reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		reverse_second_print(arr);
        sc.close();
	}
	public static void reverse_second_print(int a[]) {
		for(int i=a.length-1;i>=a.length/2;i--) {
			System.out.println(a[i]);
		}
	}

}

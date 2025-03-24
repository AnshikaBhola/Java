package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		for (int a = 0; a < n1; a++) {
			arr1[a] = sc.nextInt();
		}
		System.out.println("Enter size of 2nd array");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		for (int a = 0; a < n2; a++) {
			arr2[a] = sc.nextInt();
		}
		int arr3[]=merge(arr1, arr2);
		System.out.println("Array after merge");
		System.out.println(Arrays.toString(arr3));
		sc.close();

	}

	public static int[] merge(int a[], int b[]) {
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		return c;
		
	}

}

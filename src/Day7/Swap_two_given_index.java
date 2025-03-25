package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Swap_two_given_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		swap(a, i1, i2);
		sc.close();
	}

	public static void swap(int a[],int i1,int i2) {
		if(i1 <a.length && i2<a.length) {
			System.out.println("Array before swap : "+Arrays.toString(a));
			int temp=a[i1];
			a[i1]=a[i2];
			a[i2]=temp;
		    System.out.println("Array after swap : "+Arrays.toString(a));	
		}
		else {
			System.out.println("Index is not present in array");
		}
		
	}

}

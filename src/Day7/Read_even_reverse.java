package Day7;

import java.util.Scanner;

public class Read_even_reverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		evenIndex_print_reverse(arr);
        sc.close();
	}
	public static void evenIndex_print_reverse(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}

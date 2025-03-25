package Day7;

import java.util.Scanner;

public class Max_firstHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		System.out.println(max_first(arr));
        sc.close();
	}
    public static int max_first(int a[]) {
    	int max=a[0];
    	for(int i=0;i<a.length/2;i++) {
    		if(a[i]>max) {
    			max=a[i];
    		}
    	}
    	return max;
    }
}

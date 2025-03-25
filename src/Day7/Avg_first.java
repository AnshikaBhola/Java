package Day7;

import java.util.Scanner;

public class Avg_first {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		System.out.println(avg_first(arr));
        sc.close();
	}
    public static double avg_first(int a[]) {
    	int sum=0;
    	for(int i=0;i<a.length/2;i++) {
    			sum=sum+a[i];
    	}
    	int n=a.length/2;
    	return (double)sum/n;
    }


}

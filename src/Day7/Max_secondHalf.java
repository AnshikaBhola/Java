package Day7;

import java.util.Scanner;

public class Max_secondHalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		System.out.println(max_second(arr));
        sc.close();
	}
    public static int max_second(int a[]) {
    	int max=a[a.length/2];
    	for(int i=a.length/2+1;i<a.length;i++) {
    		if(a[i]>max) {
    			max=a[i];
    		}
    	}
    	return max;
    }


}

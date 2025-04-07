package Day17;

import java.util.Scanner;

public class Good_bad_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(goodBad(str));
		sc.close();
	}

	public static boolean goodBad(String str) {
		int arr[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i)-97)]++;
		}
		int num=0;
		for (int i : arr) {
			if (i != 0) {
				num = i;
				break;
			}
		}
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=0 && arr[i]!=num) {
        		return false;
        	}
        }
        return true;
	}
}

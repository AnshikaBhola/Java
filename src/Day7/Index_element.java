package Day7;

import java.util.Scanner;

public class Index_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
        int key=sc.nextInt();
        System.out.println(find(a,key));
        sc.close();
	}

	public static int find(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
}

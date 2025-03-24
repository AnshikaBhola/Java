package Day6;

import java.util.Scanner;

public class Even_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum(n));
		sc.close();
	}
	public static int sum(int n) {
		int ans=0;
		for(int i=n;i!=0;i/=10) {
			int rem=i%10;
			if(rem%2==0) {
				ans+=rem;
			}
		}
		return ans;
	}

}

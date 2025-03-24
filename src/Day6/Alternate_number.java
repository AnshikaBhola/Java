package Day6;

import java.util.Scanner;

public class Alternate_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println(alternate(num1,num2));
        sc.close();
	}
    
	public static int alternate(int n1,int n2) {
		n1= reverse(n1);
		int ans=0;
		while(n1!=0 || n2!=0) {
			if(n1!=0) {
				ans = ans * 10 + n1 % 10;
				n1 /= 10;
			}
			if(n2!=0) {
				ans = ans * 10 + n2 % 10;
				n2 /= 10;
			}
			
		}
		return ans;
	}
	public static int reverse(int num) {
		int ans=0;
		while (num != 0) {
			ans = ans * 10 + num % 10;
			num /= 10;
		}
        return ans;
	}

}

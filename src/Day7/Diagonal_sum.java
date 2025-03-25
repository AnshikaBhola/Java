package Day7;

import java.util.Scanner;

public class Diagonal_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
        System.out.println(diagonal(a));
        sc.close();
	}
    public static int diagonal(int a[][]) {
    	int sum=0;
    	for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					sum=sum+a[i][j];
				}
			}
		}
    	return sum;
    	
    }
}

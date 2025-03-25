package Day7;

import java.util.Scanner;

public class Max_col {

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
		for(int i=0;i<a.length;i++) {
			System.out.println("Max for column "+i+" is "+ max_col(a,i));
		}
        sc.close();
	}
    public static int max_col(int a[][],int n) {
    	int max=a[0][n];
    	for(int i=0;i<a.length;i++){
    		if(a[i][n]>max) {
    			max=a[i][n];
    		}
    	}
    	return max;
    }
}

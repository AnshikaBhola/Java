package Day6;

import java.util.Arrays;

public class Reverse_number_array {

	public static void main(String[] args) {
		int arr[]= {23,45,67,89};
		reverse_array(arr);

	}
    public static void reverse_array(int a[]) {
    	for(int i=0;i<a.length;i++) {
    		a[i]=Reverse.revNum(a[i]);
    	}
    	System.out.println(Arrays.toString(a));
    }
    
   
}

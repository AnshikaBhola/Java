package Day7;

import java.util.Arrays;

public class Reaarange_height {
	public static void main(String[] args) {
		String names[] = { "Mary", "John", "Emma" };
		int height[] = { 180, 165, 170 };
		arrange(names,height);
	}
	public static void arrange(String names[],int height[]) {
		for(int i=1;i<height.length ;i++) {
			for(int j=0;j<height.length-i;j++) {
				if(height[j]<height[j+1]) {
					String temp=names[j];
					names[j]=names[j+1];
					names[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
	}
}

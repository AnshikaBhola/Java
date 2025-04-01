package Day10;

public class Stock {

	public static void main(String[] args) {
		int a[]= {7,1,5,3,6,4};
        System.out.println(profitStock(a));
	}
    
	public static int profitStock(int a[]) {
		int max=0;
		int profit=0;
		for(int i=0;i<a.length;i++) {   
			for(int j=i+1;j<a.length;j++) {
				profit=a[j]-a[i];
				if(profit>max) {
					max=profit;
				}
			}
		}
		return max;
	}
}

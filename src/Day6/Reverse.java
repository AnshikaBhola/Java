package Day6;

public class Reverse {

	public static void main(String[] args) {
		int num=12300;
		
        System.out.println(revNum(num));
	}
	 public static int revNum(int n) {
			int ans=0;
	        while(n!=0) {
	        	ans=ans*10+n%10;
	        	n/=10;
	        }
	        return ans;
	    }

}

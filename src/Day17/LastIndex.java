package Day17;

public class LastIndex {

	public static void main(String[] args) {
		String st="bahab";
		System.out.println(lastIndexOf(st,'b'));
		System.out.println(replace(st,'b','a'));

	}
	
	static int lastIndexOf(String s,char ch) {
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}
	
	static String replace(String s,char ch1,char ch2) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			char k=s.charAt(i);
			if(k==ch1) {
				ans=ans+ch2;
			}
			else {
				ans=ans+k;
			}
		}
		return ans;
				
	}
    
}

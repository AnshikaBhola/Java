package Day17;

public class UpperCase {

	public static void main(String[] args) {
		String st="Anshika";
		String ans="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>=65 && ch<=90) {
				ans=ans+ch;
			}else {
				ch=(char)(ch-32);
				ans=ans+ch;
			}
		}
		System.out.println(ans);

	}

}

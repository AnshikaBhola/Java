package Day4;

public class UppperToLower {

	public static void main(String[] args) {
		char ch='U';
        utl(ch);
	}
    public static void utl(char ch) {
    	System.out.println((ch>='A' && ch<='Z')?(char)(ch+32):ch);
    }
}

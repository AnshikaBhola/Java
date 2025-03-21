package Day4;

public class MethodCall2 {
    
	static int num=0;
	public static void main(String[] args) {
		System.out.println("Main start");
		m1();
		System.out.println("Main end");
	}
    public static void m1() {
    	num++;
    	m2();
    }
    public static void m2() {
    	System.out.println(num);
    	m1();
    }
}

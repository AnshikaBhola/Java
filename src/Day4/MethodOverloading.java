package Day4;

public class MethodOverloading {
	
	
	//method overloading by length of formal arguments
//	public static void main(String[] args) {
//		add(10,20);
//		add(10,20,30);
//	}
//    public static void add(int a,int b) {
//    	System.out.println(a+b);
//    }
//    public static void add(int a,int b,int c) {
//    	System.out.println(a+b+c);
//    }
	
	
	
	//method overloading by  type of formal arguments
	public static void main(String[] args) {
		add(10,20);
		add(10.5,40.8);
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(double a,double b) {
		System.out.println(a+b);
	}
	

	
}

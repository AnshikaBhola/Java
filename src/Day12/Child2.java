package Day12;

public class Child2 extends Parent2 {
	
	public Child2() {
		super(10,20);
	}
	
	public Child2(int a,int b) {
		super(a,b);
	}
	
	

	public static void main(String[] args) {
		Child2 ch=new Child2();
		System.out.println(ch.a);

	}
 
}

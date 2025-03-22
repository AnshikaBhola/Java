package Day5;

public class NonStaticMethod {

	
		public void m1() {
			System.out.println("Non static method");
		}
		public static void main(String[] args) {
			NonStaticMethod ob = new NonStaticMethod();
			ob.m1();
		}

	}



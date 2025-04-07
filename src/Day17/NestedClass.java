package Day17;

public class NestedClass {
      int a=10;;
//      class Demo{
//    	  int a=20;
//      }
//      public static void main(String[] args) {
//		NestedClass p=new NestedClass();
//		System.out.println(p.a);
//		Demo d= p.new Demo();
//		System.out.println(d.a);
//		
//	}
      
      
      
      
//      static class Demo{
//    	  int a=20;
//      }
//      public static void main(String[] args) {
//		NestedClass p=new NestedClass();
//		System.out.println(p.a);
//		Demo d= new Demo();
//		System.out.println(d.a);
//		
//	}
      
      class Demo{
    	  static int a=20;
      }
      public static void main(String[] args) {
		NestedClass p=new NestedClass();
		System.out.println(p.a);
		
		System.out.println(Demo.a);
		
	}

      
      
}

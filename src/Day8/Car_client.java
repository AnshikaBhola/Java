package Day8;

public class Car_client {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="defender";
		c1.color="white";
		c1.modal_num=1234;
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.modal_num);
		    
		Car c2=new Car();
		c2.name="porche";
		c2.color="red";
		c2.modal_num=5678;
		System.out.println(c2.name);
		System.out.println(c2.color);
		System.out.println(c2.modal_num);
		
		Car c3=new Car(); 
		c3.name="endeavour";
		c3.color="black";
		c3.modal_num=8907;
		System.out.println(c3.name);
		System.out.println(c3.color);
		System.out.println(c3.modal_num);
		

	}

}

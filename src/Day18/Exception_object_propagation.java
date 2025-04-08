package Day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_object_propagation {

	public static void main(String[] args) throws FileNotFoundException {
		m1();

	}
	public static void m1()throws FileNotFoundException {
		m2();
	}
	public static void m2() throws FileNotFoundException {
		FileInputStream fileInputStream=new FileInputStream("dem.txt");
	}

}

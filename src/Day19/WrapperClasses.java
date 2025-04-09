package Day19;

import java.util.Arrays;

public class WrapperClasses {

	public static void main(String[] args) {
		Object[] arr = new Object[5];
		arr[0] = 10;
		arr[1] = false;
		arr[2] = 10.21;
		arr[3] = "String";
		arr[4] = new Car(100);
		System.out.println(Arrays.toString(arr));
		String s=(String)arr[3];
		System.out.println(s.length());

	}

}

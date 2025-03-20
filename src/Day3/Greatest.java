package Day3;

public class Greatest {

	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		int n3=30;
		int max=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println(max);
	}

}

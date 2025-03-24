package Day6;

public class Enhanced_Switch {

	public static void main(String[] args) {
		int num = 1;
		String str = switch (num) {
		case 1 -> "odd";
		case 2 -> "even";
		default -> "default";
		};
		System.out.println(str);
	}

} 

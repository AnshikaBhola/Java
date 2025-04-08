package Day17;

public class Detective_Bakshi {

	public static void main(String[] args) {
		String s1 = "Fi_er";
		String s2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
		detect(s1, s2);

	}

	public static void detect(String s1, String s2) {
 		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		String[] strArray = s2.split(":");
		String ans = "";
		int index = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '_') {
				index = i;
			}
		}
		String subf = s1.substring(0, index);
		String subl = s1.substring(index + 1);
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() == s1.length() && strArray[i].startsWith(subf) && strArray[i].endsWith(subl)) {
				ans = ans + strArray[i] + ":";
			}
		}
		ans = ans.substring(0, ans.length() - 1);
		System.out.println(ans);
	}

}

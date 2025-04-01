package Day10;

public class Mountain {

	public static void main(String[] args) {
		int a[] = { 1,1,1,2,3,2,1,1,1 };
//		int a[] = { 1, 2, 3, 4, 5 };
//		int a[] = { 3, 3, 4, 4, 5, 5 };
		System.out.println(mount(a));
	}

	public static int mount(int a[]) {
		int i = 0;
		int j = a.length / 2-1;
		int c = 0;
		while (i >= 0 && j < a.length) {
			if (a[i] + 1 == a[i + 1]) {
				i--;
			} else {
				a[i] = a[i + 1] - 1;
				c++;
				i--;
			}
			if (a[j] == a[j - 1]) {
				j++;
			} else {
				a[j] = a[j - 1] - 1;
				c++;
				j++;
			}
		}
		return c;
	}
}
package Day19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Book arr[] = new Book[4];

		arr[0] = new Book("hii", 100, 10.21);
		arr[1] = new Book("hello", 100, 10.21);
		arr[2] = new Book("hey", 800, 8.0);
		arr[3] = new Book("bye", 100, 10.21);

//		Arrays.sort(arr);
//		System.out.println(arr);  class cast exception
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Rating");
		System.out.println("2. Title");
		System.out.println("3. Price");
		int n = sc.nextInt();

 		switch (n) {
		case 1: {
			Arrays.sort(arr, new RatingComparator());
			System.out.println(Arrays.toString(arr));
		}
			break;
		case 2: {
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
			break;
		case 3: {
			Arrays.sort(arr, new TitleComparator());
			System.out.println(Arrays.toString(arr));
		}
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}
		for (Book b : arr) {
			System.out.println(b);
		}

	}

}

class RatingComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		return b1.rating.compareTo(b2.rating);

	}
}

class TitleComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		return b1.title.compareTo(b2.title);

	}
}

class Book implements Comparable {
	String title;
	int price;
	Double rating;

	public Book(String title, int price, double rating) {
		super();
		this.title = title;
		this.price = price;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", rating=" + rating + "]";
	}

	public int compareTo(Object o) {
		Book b2 = (Book) o;
		return this.price - b2.price;

	}

}

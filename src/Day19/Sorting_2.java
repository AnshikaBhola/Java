package Day19;

import java.util.Arrays;

public class Sorting_2{
	
	public static void main(String[] args) {
		Laptop [] laptop=new Laptop[4];
		
		laptop[0]=new Laptop("Pavilion",60000,16,512,"HP");
		laptop[1]=new Laptop("Victus",83000,16,512,"HP");
		laptop[2]=new Laptop("Ideapad",60000,16,1024,"Lenovo");
		laptop[3]=new Laptop("Yoga",75000,14,256,"HP");
		
		Arrays.sort(laptop);
		for (Laptop l : laptop) {
			System.out.println(l);
		}
		
	}
	
}
class Laptop  implements Comparable {

	String name;
	int price;
	int ram;
	int ssd;
	String brand;

	public Laptop(String name, int price, int ram,int ssd, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.ssd=ssd;
		this.brand = brand;
	}

	
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + ", ssd=" + ssd + ", brand=" + brand + "]";
	}


	public int compareTo(Object o) {
		Laptop l = (Laptop) o;
		if (this.price != l.price) {
			return this.price - l.price;
		}
		if(this.ssd!=l.ssd) {
			return this.ssd-l.ssd;
		}
		return this.ram - l.ram;

	}
}

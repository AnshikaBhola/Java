package Day14;

public class Student {

	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String toString() {
		String data = "[ Name->" + this.name + " : Roll no.->" + this.rollNo + " ]";
		return data;
	}

}

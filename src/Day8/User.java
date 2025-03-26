package Day8;

public class User {
	String uId;
	int password;
	String bio;

	User(String uId, int password) {
		this.uId = uId;
		this.password = password;
	}

	User(String uId, int password, String bio) {
		this(uId, password);
		this.bio = bio;
	}

	void printData() {
		if (this.uId != null)
			System.out.println("User Id: " + this.uId);
		if (this.password != 0)
			System.out.println("Password : " + this.password);
		if (this.bio != null)
			System.out.println("Bio : " + this.bio);
	}

}

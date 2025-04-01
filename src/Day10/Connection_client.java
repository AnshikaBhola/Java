package Day10;

public class Connection_client {

	public static void main(String[] args) {
		Connection c1 = Connection.getConnection("Mongo", "Tom");
		System.out.println(c1);
		System.err.println(c1.getDbName());
		Connection c2 = Connection.getConnection("Mongo", "Tom");
		System.out.println(c2);
	}

}
 
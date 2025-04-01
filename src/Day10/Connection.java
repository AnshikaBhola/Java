 package Day10;

public class Connection {
	private  static Connection connection;
	private String dbName;
	private String userName;

	private Connection(String dbName, String userName) {
		this.dbName = dbName;
		this.userName = userName;
	}

	public String getDbName() {
		return dbName;
	}

	public String getUserName() {
		return userName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static Connection getConnection(String dbName, String userName) {
		if (connection == null) {
			connection = new Connection(dbName, userName);
		}
		return connection;
	} 

}

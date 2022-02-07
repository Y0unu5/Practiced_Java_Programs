package using_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB_PrepSt {
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "mkyounus@249";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbcdb";
	private static Connection connection = null;
	private static Properties properties = null;
	static {
		try {
			Class.forName(DB_DRIVER_CLASS);
			properties = new Properties();
			properties.put("username", DB_USERNAME);
			properties.put("password", DB_PASSWORD);
			connection = DriverManager.getConnection(DB_URL, properties);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static Connection getConnection() {
		return connection;
	}
}

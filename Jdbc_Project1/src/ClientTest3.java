import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClientTest3 {

	public static void main(String[] args) throws SQLException {
		Connection connection = DBUtil.getConnection();
		if (connection != null)
			System.out.println("JDBC: connection is taken..");
		Statement st = connection.createStatement();
		String sql = "select * from employee_table";
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.println("Employee ID is:" + rs.getInt(1));
			System.out.println("Employee Name is:" + rs.getString(2));
			System.out.println("Employee email is:" + rs.getString(3));

			System.out.println("Employee salary is:" + rs.getInt(4));
		}
		try {
			connection.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
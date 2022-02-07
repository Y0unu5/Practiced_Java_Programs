package using_preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Client_Prep {
	static PreparedStatement ps = null;

	public static void main(String[] args) {
		Connection connection = DB_PrepSt.getConnection();
		if (connection != null)
			System.out.println("JDBC: connection is taken..");
		String sql = "update employee_table set employeeName='Sameer' where employeeID =201";
		try {
			ps = connection.prepareStatement(sql);
			int n = ps.executeUpdate();
			System.out.println(n);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		try {
			connection.close();
			ps.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}

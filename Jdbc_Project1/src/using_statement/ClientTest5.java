package using_statement;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;

public class ClientTest5 {
//DBClass
	public static void main(String[] args) throws SQLException {
		Connection connection = DB.getConnection();
		if (connection != null)
			System.out.println("JDBC : connection is taken..");
		Statement st = connection.createStatement();
		String sql = "insert into employee_table(employeeID,"
				+ "employeeName,employeeEMail,empSalary) values(301,'Sam','sam@mail.com',40000)";
		int n = st.executeUpdate(sql);
		System.out.println(n +" "+ "rows affected");
		try {
			connection.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

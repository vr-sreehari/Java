import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.mysql.cj.jdbc.CallableStatement;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		batch();

	}

	public static void readRecords() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		String query = "select * from employee";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("Emp ID is: " + rs.getInt(1));
			System.out.println("Emp Name is: " + rs.getString(2));
			System.out.println("Emp Salary is: " + rs.getInt(3));
		}
		con.close();
	}

	public static void insertRecords() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		String query = "insert into employee values(5,'Avatar',40000)";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("No of Rows Affected :" + rows);
		con.close();
	}

	public static void insertVariables() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		int id = 6;
		String name = "Varun";
		int salary = 50000;
		// insert into employee values(5,'Avatar',40000)
		String query = "insert into employee values(" + id + ",'" + name + "'," + salary + ");";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("No of Rows Affected :" + rows);
		con.close();
	}

	public static void insertPreparedStmt() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		int id = 7;
		String name = "Vimal";
		int salary = 510000;
		// insert into employee values(5,'Avatar',40000)
		String query = "insert into employee values(?,?,?);";
		Connection con = DriverManager.getConnection(url, user, pass);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, salary);
		int rows = pst.executeUpdate();
		System.out.println("No of Rows Affected :" + rows);
		con.close();
	}

	public static void delete() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		int id = 6;

		String query = "delete from employee where empID=" + id;
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("No of Rows Affected :" + rows);
		con.close();
	}

	public static void update() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";

		String query = "update employee set salary=5000 where empID=2";
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("No of Rows Affected :" + rows);
		con.close();
	}

	public static void procedure() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, user, pass);
		CallableStatement cstmt = (CallableStatement) con.prepareCall("{call getEmp()}");
		ResultSet rs = cstmt.executeQuery();
		while (rs.next()) {
			System.out.println("Emp ID is: " + rs.getInt(1));
			System.out.println("Emp Name is: " + rs.getString(2));
			System.out.println("Emp Salary is: " + rs.getInt(3));
		}
		con.close();
	}

	public static void procedureVar() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		int id = 3;
		Connection con = DriverManager.getConnection(url, user, pass);
		CallableStatement cstmt = (CallableStatement) con.prepareCall("{call getEmpID(?)}");
		cstmt.setInt(1, id);
		ResultSet rs = cstmt.executeQuery();
		while (rs.next()) {
			System.out.println("Emp ID is: " + rs.getInt(1));
			System.out.println("Emp Name is: " + rs.getString(2));
			System.out.println("Emp Salary is: " + rs.getInt(3));
		}
		con.close();
	}

	public static void procedureOut() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		int id = 2;
		Connection con = DriverManager.getConnection(url, user, pass);
		CallableStatement cstmt = (CallableStatement) con.prepareCall("{call getEmpName(?,?)}");
		cstmt.setInt(1, id);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.executeUpdate();
		System.out.println(cstmt.getString(2));
		con.close();
	}

	public static void commit() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		String query1 = "update employee set salary=200000 where empID=1";
		String query2 = "update employee set salary=200000 where empID=2";
		Connection con = DriverManager.getConnection(url, user, pass);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		int row1 = st.executeUpdate(query1);
		System.out.println("No of rows affected: " + row1);
		int row2 = st.executeUpdate(query2);
		System.out.println("No of rows affected: " + row2);
		if (row1 > 0 && row2 > 0)
			con.commit();
		con.close();
	}

	public static void batch() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String user = "root";
		String pass = "root";
		String query1 = "update employee set salary=10000 where empID=1";
		String query2 = "update employee set salary=10000 where empID=2";
		String query3 = "update employee set salary=10000 where empID=3";
		String query4 = "update employee set salary=10000 where empID=4";
		Connection con = DriverManager.getConnection(url, user, pass);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		st.addBatch(query1);
		st.addBatch(query2);
		st.addBatch(query3);
		st.addBatch(query4);
		int[] res = st.executeBatch();
		for (int i : res) {
			if (i > 0) {
				System.out.println("Rows Affected: " + i);
				continue;
			} else
				con.rollback();

		}
		con.commit();
		con.close();
	}

}

package jdbcprograms;
import java.sql.*;
public class UpdateRecord {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		// 1. Load the driver

				 DriverManager.registerDriver(new com.mysql.jdbc.Driver());

				 // 2. Establish the connection
				String url = "jdbc:mysql://localhost:3306/jdbc";
				String username = "root";
				String password = "password";
				Connection con = DriverManager.getConnection(url, username, password);

				 // 3. create the statement object

				 Statement st = con.createStatement();

				 // 4. write the query and execute it
				String sql = "update nseit set tech='java' where empid=1001";
				// 5. store the data in the result set
				int k = st.executeUpdate(sql);
                  
				 System.out.println(k+"Record Updated...");
				// 7. close the connections
				st.close();
				con.close();
				DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());

	}

}

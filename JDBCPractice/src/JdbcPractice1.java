import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcPractice1 {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			
			String sql = "update student set sid = 100089, sname = 'vaish' where sid = 10001;";
			
			Statement stmt = connection.createStatement();
			
			stmt.executeUpdate(sql);
			
			System.out.println("success");
			
			connection.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}

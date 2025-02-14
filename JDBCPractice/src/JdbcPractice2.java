import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcPractice2 {

	public static void main(String[] args) {
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			
			String sql = "delete from student where sid =100089";
			
			Statement createStatement = connection.createStatement();
			
			createStatement.executeUpdate(sql);
			
			System.out.println("success");
			
			connection.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

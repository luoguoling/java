import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class TestMysql{
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		String sql;
		String url="jdbc:mysql://localhost:3306/javaDemo?user=root&password=abc123?&useUnicode=true&characterEncoding=UTF8";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载mysql驱动");
			conn = DriverManager.getConnection(url);
			System.out.println(conn);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}

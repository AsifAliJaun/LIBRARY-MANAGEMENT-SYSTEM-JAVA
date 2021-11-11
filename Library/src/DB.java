import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con = null;
		try{
			 Class.forName("com.mysql.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/project8?verifyServerCertificate=false&useSSL=true";
			 String uname="root";
			 String pass="1234";
		   	 con=(Connection) DriverManager.getConnection(url,uname,pass);
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}

package DB.util;
import java.sql.*;
public class JdbcConnection extends Exception {


	
	    public Connection createConnection(){
		   String url="jdbc:oracle:thin:@10.200.20.110:1521/orcl.wipro.com";
			  String uname="team4";
			  String pwd="team4";
		Connection connect=null;
		System.out.println("jdbc connection");
		try {
			
		   Class.forName("oracle.jdbc.driver.OracleDriver");
			 connect=DriverManager.getConnection(url,uname,pwd);
			 System.out.println("Database is connect");
			
       }
	catch(Exception e){ 
		System.out.println("Error occured while connecting database"+e);
		}
	
		return connect; 
	
	}
}

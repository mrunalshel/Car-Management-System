package car;
import java.sql.*;
public class updatecar {
	
public static void main(String args[]) throws Exception
{
	//load register
	Class.forName("com.mysql.cj.jdbc.Driver");
	// create connection
	  String url = "jdbc:mysql://localhost:3306/mrunal";
      String uname ="root";
      String pass = "root454545";
      String newname="maruti";
      String query="update car set name='lamborgini' where id =11";
	Connection con=DriverManager.getConnection(url,uname,pass);
	
	//create stm
	Statement st=con.createStatement();
	
	//execute query
	st.executeUpdate(query);
	System.out.println("success");
	
}
}

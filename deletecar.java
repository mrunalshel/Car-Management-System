package car;
import java.sql.*;
public class deletecar {
	

	

				public static void main(String arg[] ) throws Exception
				{
					
			
					  String url = "jdbc:mysql://localhost:3306/mrunal";
				        String uname ="root";
				        String pass = "root454545";
				      
				         String query="delete from car where id=(1)";
				        //load class
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//create connection
				Connection con=DriverManager.getConnection(url,uname,pass);
				//create stm

				Statement st=con.createStatement();
				st.execute(query);
				System.out.println("success");
				con.close();
				

				}

			


		}






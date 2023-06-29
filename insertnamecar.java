package car;
import java.sql.*;
public class insertnamecar {

			public static void main(String arg[] ) throws Exception
			{
				
		
				  String url = "jdbc:mysql://localhost:3306/mrunal";
			        String uname ="root";
			        String pass = "root454545";
			      
			         String query="insert into car values(?,?,?,?,?)";
			        //load class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection con=DriverManager.getConnection(url,uname,pass);
			
			//createstm
			
			PreparedStatement pt=con.prepareStatement(query);
		pt.setInt(1,11);
		pt.setString(2,"mahindra");
		pt.setString(3,"red");
		pt.setInt(4,899999);
		pt.setInt(5,60);

		pt.execute();


			System.out.println("success");
			con.close();
			

			}

		


	}



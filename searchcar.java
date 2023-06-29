package car;
import java.sql.*;
import java.util.*;
public class searchcar {
	
	public static void main(String arg[] ) throws Exception
					{
		Scanner scanner=new Scanner(System.in);
		
						System.out.println("enter id of car for search");
						int no=scanner.nextInt();
				
						  String url = "jdbc:mysql://localhost:3306/mrunal";
					        String uname ="root";
					        String pass = "root454545";
					       ResultSet rs=null;
					    
					      
					         String query="select * from car where id=(11)";
					        //load class
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					//create connection
					Connection con=DriverManager.getConnection(url,uname,pass);
					//create stm

					Statement st=con.createStatement();
				rs=	st.executeQuery(query);
					System.out.println("success");
				//	System.out.println(query.id);
					
					if(rs.next())
					{
						System.out.println(rs.getString("name"));
						System.out.println(rs.getInt("id"));
						System.out.println(rs.getInt("price"));
						System.out.println(rs.getString("colour"));
						System.out.println(rs.getInt("avg"));
					}
					con.close();
					

					}

				


			}









import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vivo","root","");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static int savedata(Model m)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("insert into contact(name,email,phone,element,gender,message) values (?,?,?,?,?,?)");
			 ps.setString(1, m.getName());
			 ps.setString(2, m.getEmail());
			 ps.setString(3, m.getPhone());
			 ps.setString(4, m.getElement());
			 ps.setString(5, m.getGender());
			 ps.setString(6, m.getMessage());
	
			 status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	

}

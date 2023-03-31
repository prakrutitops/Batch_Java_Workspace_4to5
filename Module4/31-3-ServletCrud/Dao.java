import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","");
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
			PreparedStatement ps =con.prepareStatement("insert into register(name,email,address,phone) values (?,?,?,?)");
			 ps.setString(1, m.getName());
			 ps.setString(2, m.getEmail());
			 ps.setString(3, m.getAddress());
			 ps.setString(4, m.getPhone());
	
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

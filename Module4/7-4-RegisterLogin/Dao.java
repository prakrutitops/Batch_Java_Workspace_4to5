import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registerlogin","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	public static int register(Model m)
	{
		int status =0;
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into signup(name,email,password) values(?,?,?)");
			
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPass());
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	public static Model login(Model m)
	{
		Model obj = null;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPass());
		
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) 
			{
				obj = new Model();
				obj.setName(rs.getString("name"));
				obj.setEmail(rs.getString("email"));
				obj.setPass(rs.getString("pass"));

			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return obj;
	}
}

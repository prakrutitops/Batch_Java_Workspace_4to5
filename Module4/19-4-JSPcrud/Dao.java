package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Model;




public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
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
	
	public static List<Model>viewdata()
	{
		
		List<Model>list = new ArrayList<Model>();
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps =con.prepareStatement("Select * from register");
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String address = set.getString(4);
				String phone = set.getString(5);
				
				Model m =new Model();
				m.setId(id);
				m.setName(name);
				m.setEmail(email);
				m.setPhone(phone);
				m.setAddress(address);
				list.add(m);
			}
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public static void deletedata(int id)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("delete from register where id =?");
			 ps.setInt(1,id);
			
			 status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Model editdata(int id)
	{
		Model m=new Model();
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("select * from register where id =?");
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id2 = set.getInt(1);
				String name = set.getString(2);
				String email = set.getString(3);
				String address = set.getString(4);
				String phone = set.getString(5);
				
				
				m.setId(id2);
				m.setName(name);
				m.setEmail(email);
				m.setPhone(phone);
				m.setAddress(address);
			}
			 
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	
	public static int updatedata(Model m)
	{
		int status =0;
		
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("update register set name=? , email =?, address=? , phone =?  where id =?");
		
			ps.setString(1, m.getName());
			ps.setString(2, m.getEmail());
			ps.setString(3, m.getAddress());
			ps.setString(4, m.getPhone());
			ps.setInt(5,m.getId());
	
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

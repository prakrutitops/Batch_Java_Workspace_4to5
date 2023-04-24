package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam.Mode;

import com.model.Model;



public class Dao 
{
	
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");
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
			PreparedStatement ps =con.prepareStatement("insert into details(name,email,password) values (?,?,?)");
			 ps.setString(1, m.getName());
			 ps.setString(2, m.getEmail());
			 ps.setString(3, m.getPassword());
			 
	
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
		Connection con = Dao.getconnect();
		Model m2 =null;
		try 
		{
			PreparedStatement ps =con.prepareStatement("Select * from details where email=? and password=?");
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				
				
				String email = set.getString(1);
				String password = set.getString(2);
				
				m2 =new Model();
				
				m2.setEmail(email);
				m2.setPassword(password);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
		
	}
	
	
}

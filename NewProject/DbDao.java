package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.ContactModel;
import com.model.ProductModel;
import com.model.SignupModel;
import com.model.WishListModel;

public class DbDao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspproject1","root","");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	public static int savedata(SignupModel m)
	{
		int status =0;
		
		Connection con = DbDao.getconnect();
		
		try 
		{
			PreparedStatement ps =con.prepareStatement("insert into signup(name,email,mobile,password) values (?,?,?,?)");
			 ps.setString(1, m.getName());
			 ps.setString(2, m.getEmail());
			 ps.setString(3, m.getMobile());
			 ps.setString(4, m.getPassword());
	
			 status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
		public SignupModel LoginCustomer(SignupModel model) 
		{
			boolean flag = false;

			SignupModel obj = null;

			try {
				Connection con = DbDao.getconnect();
				PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
				ps.setString(1, model.getEmail());
				ps.setString(2, model.getPassword());

				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					obj = new SignupModel();
					obj.setName(rs.getString("name"));
					obj.setEmail(rs.getString("email"));
					obj.setPassword(rs.getString("password"));

				}

			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return obj;
		}
		public static int contactinsert(ContactModel m)
		{
			int status =0;
			
			Connection con = DbDao.getconnect();
			
			try 
			{
				PreparedStatement ps =con.prepareStatement("insert into contact(name,email,message) values (?,?,?)");
				 ps.setString(1, m.getName());
				 ps.setString(2, m.getEmail());
				 ps.setString(3, m.getMessage());
				 
		
				 status = ps.executeUpdate();
			}
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return status;
		}
		
		public static List<ProductModel>productviewdata()
		{
			
			List<ProductModel>list = new ArrayList<ProductModel>();
			Connection con = DbDao.getconnect();
			try 
			{
				PreparedStatement ps =con.prepareStatement("Select * from products");
				ResultSet set = ps.executeQuery();
				while(set.next())
				{
					int id = set.getInt(1);
					String pname = set.getString(2);
					String pprice= set.getString(3);
					String pimage = set.getString(4);
					
					
					ProductModel m =new ProductModel();
					m.setId(id);
					m.setProduct_name(pname);
					m.setProduct_price(pprice);
					m.setProduct_image(pimage);
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
		public static ProductModel getproductdetail(int id)
		{
			
			ProductModel m =new ProductModel();
			
				Connection con =DbDao.getconnect();
				
				try 
				{
					PreparedStatement ps =(PreparedStatement) con.prepareStatement("select * from products where id=?");
					ps.setInt(1,id);
					ResultSet set=ps.executeQuery();
					
					if(set.next())
					{
						
						m.setId(set.getInt(1));
						m.setProduct_name(set.getString(2));
						m.setProduct_price(set.getString(3));
						m.setProduct_image(set.getString(4));
						
						
					}
					
				} 
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			return m;
			
		}
		public static int WishAdd(WishListModel m) {
			int status = 0;

			Connection con = DbDao.getconnect();

			try {
				PreparedStatement ps = con.prepareStatement("insert into wishlist(id,product_name,product_price,product_image) values(?,?,?,?)");

				ps.setInt(1, m.getId());
				ps.setString(2, m.getProduct_name());
				ps.setString(3, m.getProduct_price());
				ps.setString(4, m.getProduct_image());
			

				status = ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return status;
		}	
		
		
		
	
public static List<WishListModel>wishlistviewdata()
{
	
	List<WishListModel>list = new ArrayList<WishListModel>();
	Connection con = DbDao.getconnect();
	try 
	{
		PreparedStatement ps =con.prepareStatement("Select * from wishlist");
		ResultSet set = ps.executeQuery();
		while(set.next())
		{
			int id = set.getInt(1);
			String pname = set.getString(2);
			String pprice= set.getString(3);
			String pimage = set.getString(4);
			
			
			WishListModel m =new WishListModel();
			m.setId(id);
			m.setProduct_name(pname);
			m.setProduct_price(pprice);
			m.setProduct_image(pimage);
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
}

	
	


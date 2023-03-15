package com.a153;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test implements ActionListener
{
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public Test() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		btn1 =new JButton("INSERT");
		btn2 =new JButton("VIEW");
		btn3 =new JButton("UPDATE");
		btn4 =new JButton("DELETE");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		
		frame.setSize(300,300);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
	
	}
	
	
	public static void main(String[] args) 
	{
		new Test();
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		AllOperations a =new AllOperations();
		
		if(e.getSource()==btn1)
		{
			a.insertdata();
		}
		if(e.getSource()==btn2)
		{
			a.viewdata();
		}
		if(e.getSource()==btn3)
		{
			
		}
		if(e.getSource()==btn4)
		{
			
		}
		
	}
}
class AllOperations
{
	
	JFrame insertframe;
	JTextField tf1,tf2;
	JButton insert1;
	
	public void insertdata()
	{
		insertframe =new JFrame();
		
		tf1 =new JTextField(20);
		tf2 =new JTextField(20);
		
		insert1 =new JButton("INSERT");
		
		
		insert1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				String p_name = tf1.getText().toString();
				String p_price = tf2.getText().toString();
				
				String host ="jdbc:mysql://localhost:3306/";
				String db="samsung";
				String url=host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql ="insert into product values (null,'"+p_name+"','"+p_price+"')";
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		
		insertframe.add(tf1);
		insertframe.add(tf2);
		insertframe.add(insert1);
		
		insertframe.setSize(300,300);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	}
	public void viewdata()
	{
		String host ="jdbc:mysql://localhost:3306/";
		String db="samsung";
		String url=host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String sql="select * from product";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(sql);
			System.out.println("\t ID \t Name \t \t Price");
			while(set.next())
			{
				int id = set.getInt(1);
				String p_name = set.getString(2);
				int p_price = set.getInt(3);
			
				
				System.out.println("\t"+id+" \t "+p_name+" \t "+p_price);
			}
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}

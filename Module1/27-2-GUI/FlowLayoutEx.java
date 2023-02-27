package com.a272;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx 
{
	
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public FlowLayoutEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		btn1 =new JButton("INSERT");
		btn2 =new JButton("VIEW");
		btn3 =new JButton("UPDATE");
		btn4 =new JButton("DELETE");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	public static void main(String[] args)
	{
		new FlowLayoutEx();
	}
}

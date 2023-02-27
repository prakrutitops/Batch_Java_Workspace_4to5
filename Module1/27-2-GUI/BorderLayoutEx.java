package com.a272;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx 
{
	JFrame frame;
	JButton btn1,btn2,btn3,btn4,btn5;
	
	public BorderLayoutEx()
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		btn1 =new JButton("EAST");
		btn2 =new JButton("WEST");
		btn3 =new JButton("NORTH");
		btn4 =new JButton("SOUTH");
		btn5 =new JButton("CENTER");
		
		frame.add(btn1,BorderLayout.EAST);
		frame.add(btn2,BorderLayout.WEST);
		frame.add(btn3,BorderLayout.NORTH);
		frame.add(btn4,BorderLayout.SOUTH);
		frame.add(btn5,BorderLayout.CENTER);
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new BorderLayoutEx();
	}
}

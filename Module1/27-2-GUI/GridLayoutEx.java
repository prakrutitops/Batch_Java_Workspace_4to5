package com.a272;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutEx 
{
	JFrame frame;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	public GridLayoutEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		b1 =new JButton("1");
		b2 =new JButton("2");
		b3 =new JButton("3");
		b4 =new JButton("4");
		b5 =new JButton("5");
		b6 =new JButton("6");
		b7=new JButton("7");
		b8 =new JButton("8");
		b9 =new JButton("9");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3));
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new GridLayoutEx ();
	}
}

package com.a222;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class CheckBoxEx implements ItemListener
{
	JFrame frame;
	JCheckBox chk1;
	JPasswordField pass;
	JRadioButton rb1,rb2;
	
	
	public CheckBoxEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		chk1 = new JCheckBox("I Agree all terms and conditions");
		chk1.setBounds(113, 52, 222, 23);
		
		pass =new JPasswordField();
		pass.setBounds(113, 152, 222, 23);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(113, 200, 222, 23);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(113, 240, 222, 23);
		
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		chk1.addItemListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		frame.add(chk1);
		frame.add(pass);
		frame.add(rb1);
		frame.add(rb2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new CheckBoxEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==chk1)
		{
			frame.setVisible(false);
		}
		
		if(e.getSource()==rb1)
		{
			//frame.setVisible(false);
			System.out.println("Male");
		}
		
		else if(e.getSource()==rb2)
		{
			//frame.setVisible(false);
			System.out.println("Female");
		}
		
	}
}

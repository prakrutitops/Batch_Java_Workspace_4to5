package com.task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Swing - J
//AWT

public class FirstFrameEx implements ActionListener
{
	JFrame frame;
	JLabel label;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	public FirstFrameEx()
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame("My First Frame Example");
		label = new JLabel("Calculator Project");
		label.setBounds(185, 40, 146, 14);
		
		tf1 = new JTextField();
		tf1.setBounds(178, 80, 186, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(178, 120, 186, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(178, 160, 186, 20);
		tf3.setEditable(false);

		btn1 = new JButton("+");
		btn1.setBounds(178, 200, 86, 50);
		
		btn2 = new JButton("-");
		btn2.setBounds(300, 200, 86, 50);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(label);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new FirstFrameEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		int ans = 0;
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		
		if(e.getSource()==btn1)
		{
			ans = Integer.parseInt(a)+Integer.parseInt(b);
		}
		if(e.getSource()==btn2)
		{
			ans = Integer.parseInt(a)-Integer.parseInt(b);
		}
		tf3.setText(String.valueOf(ans));
	}
}

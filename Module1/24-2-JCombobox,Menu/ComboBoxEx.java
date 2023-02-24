package com.a242;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxEx 
{
	JFrame frame;
	JComboBox cb;
	JButton btn;
	JLabel l1;
	String city[]= {"Rajkot","Baroda","Surat"};
	
	public ComboBoxEx() 
	{
		frame =new JFrame();
		
		cb =new JComboBox<>(city);
		cb.setBounds(172, 21, 128, 20);
		
		btn =new JButton("Submit");
		btn.setBounds(172, 55, 89, 23);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				l1.setText("Selected Value: "+cb.getItemAt(cb.getSelectedIndex()));
				
			}
		});
		
		l1 =new JLabel("");
		l1.setBounds(201, 110, 146, 14);
		
		frame.add(cb);
		frame.add(btn);
		frame.add(l1);
	
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ComboBoxEx();
	}
}

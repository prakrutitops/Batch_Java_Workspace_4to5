package com.a222;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CafeSystemEx extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JButton btn1;
	JLabel l1;
	
	public CafeSystemEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		chk1 =new JCheckBox("Pizza @ rs. 150");
		chk1.setBounds(172, 120, 197, 23);
		
		chk2 =new JCheckBox("Burger @ rs. 70");
		chk2.setBounds(172, 160, 197, 23);
		
		chk3 =new JCheckBox("Coffee @ rs. 120");
		chk3.setBounds(172, 200, 197, 23);
		
		btn1 =new JButton("ORDER");
		btn1.setBounds(172, 240, 89, 23);
		
		l1=new JLabel("Cafe Ordering System");
		l1.setBounds(160, 80, 146, 14);
		
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(this);
		btn1.addActionListener(this);
		/*btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});*/
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new CafeSystemEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		StringBuilder builder =new StringBuilder("");
		builder.append("\n Selected Items \n");
		
		int amount = 0;
		
		if(e.getSource()==btn1)
		{
			if(chk1.isSelected())
			{
				builder.append("\n Pizza @ rs. 150");
				amount+=150;
			}
			if(chk2.isSelected())
			{
				builder.append("\n Burger @ rs. 70");
				amount+=70;
			}
			if(chk3.isSelected())
			{
				builder.append("\n Coffee @ rs. 120");
				amount+=120;
			}
			
			builder.append("\n Total :"+amount);
			
			JOptionPane.showMessageDialog(frame, builder.toString());
		}
		
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		super.windowClosing(e);
		
		int ans = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		
		if(ans==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(ans==JOptionPane.NO_OPTION)		
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		if(ans==JOptionPane.CANCEL_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		
	}

	
}

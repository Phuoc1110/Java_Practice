package com.NoVC_21_30;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.*;

public class Lesson28_Layouts extends JFrame{
	
	JButton button1, button2, button3, button4, button5;
	
	public static void main(String[] args) {
		
		new Lesson28_Layouts();
		
	}
	
	public Lesson28_Layouts() {
		
		this.setTitle("Lesson 26");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		//FLOW LAYOUT
		/*
		thePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 60, 20));
		
		button1 = new JButton("BTN1");
		
		thePanel.add(button1);
		
		button2 = new JButton("BTN2");
		
		thePanel.add(button2);
		*/
		
		//BOX LAYOUT
		/*
		thePanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Button 1");
		
		button2 = new JButton("Button 2");
		
		button3 = new JButton("Button 3");
		
		button4 = new JButton("Button 4");
		
		button5 = new JButton("Button 5");
		
		JPanel northPanel = new JPanel();
		
		northPanel.add(button1);
		northPanel.add(button2);
		
		thePanel.add(northPanel, BorderLayout.NORTH);
		thePanel.add(button3, BorderLayout.EAST);
		thePanel.add(button4, BorderLayout.WEST);
		thePanel.add(button5, BorderLayout.CENTER);
		*/
		this.add(thePanel);
		
		this.setVisible(true);
	}
}
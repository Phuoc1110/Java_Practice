package com.NoVC_21_30;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.*;

public class Lesson28_Layouts extends JFrame{
	
	JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, btnPlus, btnMinus;
	
	public static void main(String[] args) {
		
		new Lesson28_Layouts();
		
	}
	
	public Lesson28_Layouts() {
		
		this.setTitle("Lesson 26");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//FLOW LAYOUT
		/*
		 * 
		JPanel thePanel = new JPanel();
		
		thePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 60, 20));
		
		button1 = new JButton("BTN1");
		
		thePanel.add(button1);
		
		button2 = new JButton("BTN2");
		
		thePanel.add(button2);
		*/
		
		//BORDER LAYOUT
		/*
		JPanel thePanel = new JPanel();
		
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
		
		//BOX LAYOUT
		
		/*
		Box theBox = Box.createHorizontalBox();
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		
		theBox.add(button1);
		theBox.add(Box.createHorizontalStrut(4));//Tao mot khoang trong
		theBox.add(button2);
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(button3);
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(button4);
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(button5);
		*/
		
		
		//GRID LAYOUT
		JPanel thePanel = new JPanel();
		thePanel.setLayout(new GridLayout(0, 3));
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		btnPlus = new JButton("+");
		button0 = new JButton("0");
		btnMinus = new JButton("-");
		
		thePanel.add(button1);
		thePanel.add(button2);
		thePanel.add(button3);
		thePanel.add(button4);
		thePanel.add(button5);
		thePanel.add(button6);
		thePanel.add(button7);
		thePanel.add(button8);
		thePanel.add(button9);
		thePanel.add(btnPlus);
		thePanel.add(button0);
		thePanel.add(btnMinus);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}
}
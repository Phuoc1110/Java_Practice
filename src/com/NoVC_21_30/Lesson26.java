package com.NoVC_21_30;

import javax.swing.*;

import java.awt.event.*;

import java.awt.Dimension;

import java.util.Date;
import java.util.Calendar;

public class Lesson26 extends JFrame {
	
	JButton btn1;
	JSpinner spinner1,spinner2, spinner3, spinner4;
	
	String outputString = "";
	
	public static void main(String[] args) {
		
		Lesson26 lesson26 = new Lesson26();
		
	}
	
	public Lesson26() {
		
		this.setTitle("Lesson 26");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		btn1 = new JButton("Answer");
		
		btn1.addActionListener(e -> {
			if (e.getSource() == btn1) {
			
				outputString += "Spinner 1 Value: " + spinner1.getValue() + "\n";
				outputString += "Spinner 2 Value: " + spinner2.getValue() + "\n";
				outputString += "Spinner 3 Value: " + spinner3.getValue() + "\n";
				outputString += "Spinner 4 Value: " + spinner4.getValue() + "\n";	
				JOptionPane.showMessageDialog(this, outputString);
				
				
			}
		});
		
		thePanel.add(btn1);
		
		spinner1 = new JSpinner();
		
		thePanel.add(spinner1);
		
		spinner2 = new JSpinner(new SpinnerNumberModel(6, 1, 100, 5));
		
		thePanel.add(spinner2);
		
		String[] weekDays = {"Mon", "Tues", "Weds", "Thurs", "Fri", "Sat", "Sun"};
		
		spinner3 = new JSpinner(new SpinnerListModel(weekDays));
		
		thePanel.add(spinner3);
		
		Dimension d = spinner3.getPreferredSize();
		d.width = 80;
		spinner3.setPreferredSize(d);
		
		Date todaysDate = new Date();
		
		spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));
		
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, 	"dd/MM/yy");
		
		spinner4.setEditor(dateEditor);
		
		thePanel.add(spinner4);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}
	
}
package com.NoVC_21_30;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lesson24 extends JFrame {
	
	JList<String> favoriteShows;
	JButton button1;
	JList<String> favoriteMovies, favoriteColors;
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;
	
	String infoOnComponent;
	
	public static void main(String[] args) {
		
		Lesson24 l24 = new Lesson24();
		
	}
	
	public Lesson24() {
		
		this.setTitle("Lesson 24");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		String[] shows = {"Breaking Bad", "Doctor Who", "Interstella"};
		
		favoriteShows = new JList<String>(shows);
		
		favoriteShows.setFixedCellHeight(30);
		
		favoriteShows.setFixedCellWidth(150);
		
		favoriteShows.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		thePanel.add(favoriteShows);
		
		String[] colors = {"Color 1", "Color 2", "Color 3", "Color 4", "Color 5", "Color 6", "Color 7"};
		
		for (String color : colors) {
			defListModel.addElement(color);
		}
		
		defListModel.add(2,"Purple");
		
		JList<String> favoriteColors = new JList<String>(defListModel);
		
		favoriteColors.setFixedCellHeight(30);
		favoriteColors.setFixedCellWidth(150);
		
		favoriteColors.setVisibleRowCount(4);
		
		scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		thePanel.add(scroller);
		
		button1 = new JButton("Get Answer");
		
		button1.addActionListener(e -> {
			if (e.getSource() == button1) {
				if (defListModel.contains("Purple")) infoOnComponent += "Purple is there\n";
				
				if (defListModel.isEmpty()) infoOnComponent += "Nothing is here\n";
				
				infoOnComponent += "Element in the list: " + defListModel.getSize() + "\n";
				
				infoOnComponent += "Last element: " + defListModel.lastElement() + "\n";
				
				infoOnComponent += "First element: " + defListModel.firstElement() + "\n";
				
				JOptionPane.showMessageDialog(Lesson24.this, infoOnComponent, "Answer", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = "";
			}
		});
				
		thePanel.add(button1);
		
		this.add(thePanel);
		this.setVisible(true);
		
	}
	
}
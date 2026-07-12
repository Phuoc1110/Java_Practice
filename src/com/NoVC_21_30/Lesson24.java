package com.NoVC_21_30;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Lesson24 extends JFrame {
	
	JComboBox<String> favoriteShows;
	JButton button1;
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
		
		favoriteShows = new JComboBox<String>();
		
		favoriteShows.addItem("Devil May Cry");
		favoriteShows.addItem(shows[0]);
		favoriteShows.addItem("?");
		
		thePanel.add(favoriteShows);
		
		button1 = new JButton("Get Answer");
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource() == button1) {
					
					favoriteShows.setEditable(true);
					
					infoOnComponent += "Item at 0 :" + favoriteShows.getItemAt(0) + "\n";
					
					infoOnComponent += "Num of shows: " + favoriteShows.getItemCount() + "\n";
					
					infoOnComponent += "Selected ID :" + favoriteShows.getSelectedIndex() + "\n";
					
					infoOnComponent += "Selected Value: " + favoriteShows.getSelectedItem() + "\n";
					
					infoOnComponent += "Are editable: " + favoriteShows.isEditable() + "\n";
					
					JOptionPane.showMessageDialog(Lesson24.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		
		thePanel.add(button1);
		
		this.add(thePanel);
		this.setVisible(true);
		
	}
	
}
package com.NoVC_21_30;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;

import java.util.Enumeration;

import javax.swing.tree.*;

public class Lesson27_Tree extends JFrame {
	
	JButton button1;
	String outputString = "";
	
	JTree theTree;
	
	//Nodes
	DefaultMutableTreeNode documents, work, games, emails;
	
	//Root node
	DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");
	
	public static void main(String[] args) {
	
		new Lesson27_Tree();
		
	}
	
	public Lesson27_Tree() {
		
		this.setTitle("Lesson 26");
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		//BTN
		button1 = new JButton("Get Answer");
		
		button1.addActionListener(e -> {
			
			if (e.getSource() == button1) {
				
				Object treeObject = theTree.getLastSelectedPathComponent();
				
				DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObject;
				
				String treeNode = (String) theFile.getUserObject();
				
				outputString += "Node name: " + treeNode + "\n";
				
				outputString += "Number of children: " + theFile.getChildCount() + "\n";
				
				outputString += "Number of Siblings: " + theFile.getSiblingCount() + "\n";
				
				outputString += "Parents: " + theFile.getParent() + "\n";
				
				outputString += "Next node: " + theFile.getNextNode() + "\n";
				
				outputString += "Previous node: " + theFile.getPreviousNode() + "\n";
				
				outputString += "\nChild of node:\n";
				
				for (Enumeration enuValue = theFile.children(); enuValue.hasMoreElements();) {
					outputString += enuValue.nextElement() + "\n";
				}
				
				JOptionPane.showMessageDialog(this, outputString, "Node Content", JOptionPane.INFORMATION_MESSAGE);
				
				outputString = "";
				
			}
			
		});
		
		thePanel.add(button1);
		
		theTree = new JTree(fileSystem);
		
		theTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		theTree.setVisibleRowCount(8);
		
		documents = addAFile("Docs", fileSystem);
		
		addAFile("Taxes.exl", documents);
		addAFile("Story.exl", documents);
		
		emails = addAFile("Emails", documents);
		addAFile("Taxes2.exl", emails);
		addAFile("Schedule.txt", documents);
		
		work = addAFile("Work", fileSystem);
		addAFile("Schedule2.txt", work);
		addAFile("Schedule3.txt", work);
		
		games = addAFile("Games", fileSystem);
		addAFile("game1.txt", work);
		addAFile("game2.txt", work);
		
		JScrollPane scroller = new JScrollPane(theTree);
		
		Dimension d = scroller.getPreferredSize();
		
		d.width = 200;
		scroller.setPreferredSize(d);
		
		thePanel.add(scroller);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}

	private DefaultMutableTreeNode addAFile(String fileName, DefaultMutableTreeNode parentFolder) {
		
		DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);
		parentFolder.add(newFile);
		
		return newFile;
		
	}
	
}
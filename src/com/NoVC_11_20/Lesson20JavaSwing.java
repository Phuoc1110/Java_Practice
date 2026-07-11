package com.NoVC_11_20;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import java.awt.Event;

public class Lesson20JavaSwing extends JFrame{
	
	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClickedl;
	
	public static void main(String[] args) {
		
		new Lesson20JavaSwing();
		
	}
	
	public Lesson20JavaSwing() {
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension dim = tk.getScreenSize();
		int xPosition = (dim.width / 2) - (this.getWidth() / 2);
		int yPosition = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPosition, yPosition);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Basic java swing");
		
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("Your Name: ");
		
		label1.setToolTipText("Do nothing");
		
//		BTN
		button1 = new JButton("Change text");
//		BTN Listener
		ListenForButton listener = new ListenForButton();
		button1.addActionListener(listener);
		
		textField1 = new JTextField("Please enter your name", 10);
		textField1.setColumns(19);
		
		ListenForKeys lForKeys = new ListenForKeys();
		textField1.addKeyListener(lForKeys);
		
//		Text Area
		textArea1 = new JTextArea(15,20);
		
		textArea1.setText("");
		
		textArea1.setLineWrap(true);
		
//		Scrollbar: đây là hành động bọc textArea1 bằng scrollbar và vì vậy ta không nên add textArea1 vào nữa vì làm vậy sẽ lôi nó ra khỏi scrollbar & vì scrollbar đã chứa nó khi add rồi
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		
		
		
//		ADD TO PANEL
		thePanel.add(label1);
		thePanel.add(textField1);
		thePanel.add(button1);
//		thePanel.add(textArea1);
		thePanel.add(scrollbar1);
		
//		ADD PANEL TO FRAME
		this.add(thePanel);		
		
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				textArea1.append("Windows is active");
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		thePanel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				textArea1.append("Mouse Pressed\n");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		this.setVisible(true);
	}
	
	
	
	
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				
				buttonClickedl++;
				
				textArea1.append("Button clicked " + buttonClickedl + " times.\n");
				
			}
			
		}
		
	}
	
	private class ListenForKeys implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
//			textArea1.append("Key Released: " + e.getKeyChar());
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}

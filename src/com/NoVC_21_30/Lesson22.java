package com.NoVC_21_30;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Lesson22 extends JFrame {
	
	JButton calculateBtn;
	JLabel num1,num2;
	JTextField textField1,textField2;
	JCheckBox dollars,commas;
	TitledBorder border;
	JRadioButton 足す,引く,かける,割;
	ButtonGroup operationGroup;
	JLabel perfomanceCountLabel,performNum;
	JSlider slider;
	
	double number1,number2,number3,total;
	
	public static void main(String[] args) {
	
		Lesson22 lesson22 = new Lesson22();
	
	}
	
	public Lesson22() {
		//Basic setup
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPosition = (dim.width / 2) - (this.getWidth() / 2);
		int yPosition = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPosition, yPosition);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		//Component
		calculateBtn = new JButton("Calculate");
		num1 = new JLabel("Number 1 ");
		num2 = new JLabel("Number 2 ");
		
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		
		dollars = new JCheckBox("Dollars");
		commas = new JCheckBox("Commas");
		
		border = BorderFactory.createTitledBorder("Operation");
		
		足す = new JRadioButton("add");
		引く = new JRadioButton("minus");
		かける = new JRadioButton("times");
		割 = new JRadioButton("divide");
		
		operationGroup = new ButtonGroup();
		operationGroup.add(足す);
		operationGroup.add(引く);
		operationGroup.add(かける);
		operationGroup.add(割);
		足す.setSelected(true);
		
		perfomanceCountLabel = new JLabel("Perform how many times?");
		performNum = new JLabel();
		
		slider = new JSlider(0, 99, 1);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintLabels(true);
		performNum.setText(String.valueOf(slider.getValue()));
		//Event listener
		slider.addChangeListener(new ChangeListener() {
		    @Override
		    public void stateChanged(ChangeEvent e) {
		        performNum.setText(String.valueOf(slider.getValue()));
		    }
		});
		
		calculateBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == calculateBtn) {
					try {
						number1 = Double.parseDouble(textField1.getText());
						number2 = Double.parseDouble(textField2.getText());
					} 
					catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(Lesson22.this, "Enter the right info", "ERROR", JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					if (足す.isSelected()) {
						total = addNumbers(number1, number2, slider.getValue());
					}
					else if (引く.isSelected()) {
						total = subtractNumbers(number1, number2, slider.getValue());
					}
					else if (かける.isSelected()) {
						total = multiplyNumbers(number1, number2, slider.getValue());
					}
					else {
						total = divideNumbers(number1, number2, slider.getValue());
					}
					
					if (dollars.isSelected()) {
						NumberFormat numFormat = NumberFormat.getCurrencyInstance();
						JOptionPane.showMessageDialog(Lesson22.this, numFormat.format(total), "Solution", JOptionPane.INFORMATION_MESSAGE);
					}
					else if (commas.isSelected()) {
						NumberFormat numFormat = NumberFormat.getNumberInstance();
						JOptionPane.showMessageDialog(Lesson22.this, numFormat.format(total), "Solution", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(Lesson22.this, total, "Solution", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
			}
			
			

			private double divideNumbers(double number1, double number2, int value) {
				for (int i = 0; i < value; i++) {
					number1 = number1 / number2;
				}
				return number1;
			}

			private double multiplyNumbers(double number1, double number2, int value) {
				return number1 * (number2 * value);
			}

			private double subtractNumbers(double number1, double number2, int value) {
				return number1 - number2 * value;
			}

			private double addNumbers(double number1, double number2, int value) {
				return number1 + number2 * value;
			}
		});
		
		
		//Add component
		panel1.add(calculateBtn);
		panel1.add(num1);
		panel1.add(textField1);
		panel1.add(num2);
		panel1.add(textField2);
		
		panel2.add(dollars);
		panel2.add(commas);
		
		panel3.add(足す);
		panel3.add(引く);
		panel3.add(かける);
		panel3.add(割);
		panel3.setBorder(border);
		
		panel4.add(perfomanceCountLabel);
		panel4.add(performNum);
		panel4.add(slider);
		
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);		
		
		//Add panel
		JPanel outerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
		outerPanel.add(mainPanel);
		this.add(outerPanel);
		
		
		this.setVisible(true);
	}
}

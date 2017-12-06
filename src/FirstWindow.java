import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame{
	
	
	
	public FirstWindow() {
		super("d00g is quite special"); //super : references constructor of JFrame
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel(new GridBagLayout());
		p3.setBackground(Color.YELLOW);
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.CYAN);
		
		JPanel p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.PINK);
		
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.RED);
		
		JButton b2 = new JButton("Button 1.1");
		b2.setBackground(Color.BLACK);
		
		JButton b3 = new JButton("Button 2");
		b3.setBackground(Color.GREEN);
		
		JButton b4 = new JButton("Button 2.1");
		b4.setBackground(Color.ORANGE);
		
		JButton b5 = new JButton("Button 2.2");
		b5.setBackground(Color.ORANGE);
		
		JButton b6 = new JButton("Button 2.3");
		b6.setBackground(Color.ORANGE);
		
		
		JCheckBox cb1 = new JCheckBox("Are you?");
		cb1.setBackground(Color.BLUE);
		
		JCheckBox cb2 = new JCheckBox("Do you?");
		Color myNewColor = new Color(220,110,120,100);
		cb2.setBackground(myNewColor);
		
		
		JLabel myLabel = new JLabel("Laaaabel.");
		JTextArea myTextArea = new JTextArea("Text Areaaaaaa.");
		JTextField myTextField = new JTextField("Text Fiiiieeeld.");
		JLabel myLabel2 = new JLabel("Laaaabel.");
		JTextArea myTextArea2 = new JTextArea("Text Areaaaaaa.");
		JTextField myTextField2 = new JTextField("Text Fiiiieeeld.");
		JLabel myLabel3 = new JLabel("Laaaabel.");
		JTextArea myTextArea3 = new JTextArea("Text Areaaaaaa.");
		JTextField myTextField3 = new JTextField("Text Fiiiieeeld.");
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		
		
		
		p1.add(b1);
		p1.add(b2);
		p2.add(cb1);
		p2.add(cb2);
		p4.add(b3);
		
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(myLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myTextArea, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myTextField, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(myLabel2, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p3.add(myTextArea2, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		p3.add(myTextField2, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(myLabel3, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		p3.add(myTextArea3, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		p3.add(myTextField3, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p5.add(b4,gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p5.add(b5, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p5.add(b6, gbc);
		
		
		
		//p3.add(myLabel);
		//p4.add(myTextArea);
		//p5.add(myTextField);
		
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.WEST);
		add(p5, BorderLayout.EAST);
		
		setVisible(true);
	} // constructor closer
	
	
	
	
	
} // FirstWindow closer

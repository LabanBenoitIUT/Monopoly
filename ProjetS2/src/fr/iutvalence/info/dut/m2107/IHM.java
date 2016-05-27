/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author aurélien
 */
public class IHM extends JFrame{
	
	private  JPanel pan  = new JPanel();
	private JButton Jouer = new JButton("Jouer");
	private JButton Quitter = new JButton("Quitter");
	
	public IHM()
	{
		JFrame frame = new JFrame();
		frame.add(new JLabel(new ImageIcon("G:\\git\\Monopoly\\ProjetS2\\image\\monopoly.jpg")));
		frame.setTitle("Monopoly");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int)dimension.getHeight();
		int width  = (int)dimension.getWidth();
		frame.setSize(/*width,height*/ 600,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		pan.setLayout(null);
		Jouer.setBounds(244, 330, 100, 50);
		Jouer.setBackground(Color.orange);
		Quitter.setBounds(500, 420, 75, 35);
		Quitter.setBackground(Color.LIGHT_GRAY);
		pan.add(Jouer);
		pan.add(Quitter);
		frame.add(pan);
		

	    
	    
	  
	}
}
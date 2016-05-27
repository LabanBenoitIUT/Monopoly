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
	private JLabel image = new JLabel();
	private JButton Jouer = new JButton("Jouer");
	
	public IHM()
	{
	
		this.setTitle("Monopoly");
	    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    int height = (int)dimension.getHeight();
	    int width  = (int)dimension.getWidth();
	    this.setSize(width,height);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(pan);
	    pan.setBackground(Color.LIGHT_GRAY);  
	    image.setIcon(new ImageIcon("G:\\git\\Monopoly\\ProjetS2\\image\\monopoly.jpg"));
	    this.getContentPane().add(Jouer, BorderLayout.EAST);
	    image.setBounds(0,0,1800,1500);
	    this.getContentPane().add(image);
	    this.setVisible(true);
	}
}
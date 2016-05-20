package fr.iutvalence.info.dut.m2107;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.Dimension;
import java.awt.Graphics;

/**
 * application who execute a Monopoly
 * @author laban benoit
 *
 */
public class Main
{
	/**
	 * begin the game
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args)
	{
		
		new Partie().Play();
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Monopoly");
	    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    int height = (int)dimension.getHeight();
	    int width  = (int)dimension.getWidth();
	    fenetre.setSize(width, height);
	    fenetre.setLocationRelativeTo(null);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setVisible(true);
	 }

}

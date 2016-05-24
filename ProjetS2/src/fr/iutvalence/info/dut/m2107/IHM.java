/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author aurélien
 *
 */
public class IHM extends JFrame{
	
	public IHM()
	{
	
		this.setTitle("Monopoly");
	    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    int height = (int)dimension.getHeight();
	    int width  = (int)dimension.getWidth();
	    this.setSize(width, height);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel pan  = new JPanel();
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.LIGHT_GRAY);        
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(pan);
	    
	    this.setVisible(true);

	}
           
    
}


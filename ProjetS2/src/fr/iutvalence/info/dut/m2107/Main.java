package fr.iutvalence.info.dut.m2107;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

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
	public static void main(String[] args)
	{
		new Partie().Play();
		System.out.println();
		JFrame fenetre = new JFrame();
		fenetre.setVisible(true);
	}

}

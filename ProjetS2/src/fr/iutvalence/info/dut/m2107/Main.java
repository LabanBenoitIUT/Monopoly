package fr.iutvalence.info.dut.m2107;

/**
 * application who execute a Monopoly
 * @author laban benoit
 *
 */
public class Main
{
	/**
	 * begin the game
	 * @param args .
	 */
	public static void main(String[] args)
	{
		IHM fenetre = new IHM();
		new Partie().Play();
	 }

}

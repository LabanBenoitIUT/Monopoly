package fr.iutvalence.info.dut.m2107;
/**
 * define a dice
 * @author Dylan Berard
 *
 */
public class Des
{	
	/**
	 * The value of a dice
	 */
	private static int valeurDe;
	
	
	/**
	 * Used to get a random number between 1 and 6
	 * @return valeurDe
	 */
	public static int lancerDe(){

		valeurDe = 0;

		valeurDe = (int)(1+ 6*Math.random());

		return valeurDe;

		}
	
	/**
	 * Used to compare the values of two dices
	 * @param de1
	 * @param de2
	 * @return false if de1 != de2
	 * @return true if de1=de2
	 */
	public static boolean isDouble(int de1, int de2){
		
		if(de1==de2)
		{
			return true;
		}
		
		else
			return false;
		}

}

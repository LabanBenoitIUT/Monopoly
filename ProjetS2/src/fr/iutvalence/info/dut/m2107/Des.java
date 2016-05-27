package fr.iutvalence.info.dut.m2107;
/**
<<<<<<< HEAD
 * this class defines the dice of a game
 * @author berarddy
=======
 * define a dice
 * @author Dylan Berard
>>>>>>> branch 'master' of https://github.com/LabanBenoitIUT/Monopoly.git
 *
 */
public class Des
{	
	/**
	 * Value of the first dice
	 */
	private int ValeurDes1;
	
	/**
	 * Value of the second dice
	 */
	private int ValeurDes2;
	
	
	/**
	 * Constructor of a dice
	 * @param nbFace
	 * @param valeurDes1
	 * @param valueDes2
	 */
	public Des() {
		ValeurDes1 =(Integer) null;
		ValeurDes2 = (Integer) null;
	}

	/**
	 * Used to get a random number between 1 and 6
	 */
	public void lancerDes(){

		this.ValeurDes1 = (int)(1+ 6*Math.random());
		this.ValeurDes2 = (int)(1+ 6*Math.random());
	}

	/**
	 * getter for the value of the first dice
	 * @return ValeurDes1
	 */
	public int getValeurDes1() {
		return ValeurDes1;
	}

	/**
	 * getter for the value of the second dice
	 * @return ValeurDes2
	 */
	public int getValeurDes2() {
		return ValeurDes2;
	}

	
	/**
	 * boolean to check if the values of the twice dice are the same
	 * @return boolean resultDouble
	 */
	public static boolean isDouble(int ValeurDes1, int ValeurDes2) {
		
		boolean resultDouble;
		resultDouble = false;
		if(ValeurDes1==ValeurDes2){
			resultDouble = true;}
		return resultDouble;
	}
	
}
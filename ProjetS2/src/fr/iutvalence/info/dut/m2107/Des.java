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
	
	private static int NB_FACE=6;
	private int nbFace;
	
	/**
	 * The value of a dice
	 */
	private static int valeurDe;
	
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
	public Des(int nbFace, int valeurDes1, int valeurDes2) {
		super();
		this.nbFace = NB_FACE;
		ValeurDes1 = valeurDes1;
		ValeurDes2 = valeurDes2;
	}

	
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
	 * getter for the value of the first dice
	 * @return int ValeurDess
	 */
	public int getValeurDes1() {
		return ValeurDes1;
	}

	
	/**
	 * getter for the value of the second dice
	 * @return int ValeurDes2
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

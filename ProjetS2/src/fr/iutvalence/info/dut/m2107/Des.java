package fr.iutvalence.info.dut.m2107;
/**
 * this class defines the dice of a game
 * @author berarddy
 *
 */
public class Des
{
	
	/**
	 * Default value for the nbface of each dice
	 */
	private static final int DEFAULT_NBFACE = 6;
	
	
	/**
	 * It's the number of the side of each dice
	 */
	private final int nbFace;
	

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
		this.nbFace = DEFAULT_NBFACE;
		ValeurDes1 = valeurDes1;
		ValeurDes2 = valeurDes2;
	}

	
	/**
	 * getter for the value of the first dice
	 * @return int ValeurDes1
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
	public boolean isDouble() {
		
		boolean resultDouble;
		resultDouble = false;
		if(this.ValeurDes1==this.ValeurDes2){
			resultDouble = true;}
		
		return resultDouble;
	}
	
}

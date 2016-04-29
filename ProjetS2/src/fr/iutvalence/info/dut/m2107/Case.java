package fr.iutvalence.info.dut.m2107;

/**
 * This class defines each case of the game
 * @author berarddy
 *
 */
public class Case
{
	
	/**
	 * Defines the type of the case
	 */
	private final String type;
	
	
	/**
	 * Defines the position of the case
	 */
	private final int position;
	
	
	/**
	 * Defines the name of the case
	 */
	private final String nom;
	
	
	/**
	 * Constructor of a case
	 * @param type
	 * @param position
	 * @param nom
	 */
	public Case(String type, int position, String nom) {
		super();
		this.type = type;
		this.position = position;
		this.nom = nom;
	}


	/**
	 * Getter for the type of the case
	 * @return
	 */
	public String getType() {
		return type;
	}
	
	
	/**
	 * Getter for the position of the case
	 * @return
	 */
	public int getPosition() {
		return position;
	}
	
	
	/**
	 * Getter for the name of the case
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	
	
}

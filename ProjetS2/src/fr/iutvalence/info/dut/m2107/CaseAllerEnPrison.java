package fr.iutvalence.info.dut.m2107;

/**
 * cases go to prison of the monopoly game
 * @author veyrea
 *
 */
public class CaseAllerEnPrison extends Cases{
	
	/**
	 * the values of the position of the prison
	 */
	private int destination;
	
	/**
	 * create the case AllerEnPrison
	 */
	public CaseAllerEnPrison(){
		this.type = "aller en prison";
		this.position = 30;
		this.nom = "aller en prison";
		this.destination = 10;
	}
	
	/**
	 * @return the destination
	 */
	public int getDestination() {
		return this.destination;
	}
	
	/**
	 * upgrade the position of the current player with the position of the prison
	 * @param joueur the current player
	 */
	public void goToPrison(Joueur joueur){
		joueur.setPosition(getPosition());
	}
	
	
	

}

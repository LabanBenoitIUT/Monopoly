package fr.iutvalence.info.dut.m2107;

/**
 * define a player
 * @author Aurelien VEYRE
 *
 */
public class Joueur
{
	/**
	 * name of the player
	 */
	private String name;
	
	/**
	 * position of the player on the board
	 */
	private int position;
	
	/**
	 * number of successive double with dices for the player
	 */
	private int nbDouble;
	
	/**
	 * check if the player didn't lose:
	 * TRUE if the player can play and FALSE if the player abandoned or lose
	 *
	 */
	private boolean estDansLaPartie;
	
	/**
	 * number of round where the player is in prison
	 */
	private int nbTourPrison;
	
	/**
	 *  amount of the account of the player
	 */
	private int argentSurLeCompte;
	
	/**
	 * number of card escape prison
	 */
	private int nbCarteSortiePrison;
	
	/**
	 * check if the player is in prison:
	 */
	private boolean enPrison;
	
	/**
	 * constructor of the player
	 */
	public Joueur(String name)
	{
		this.name =  name;
		this.argentSurLeCompte = 3000;
		this.enPrison = false;
		this.estDansLaPartie = true;
		this.nbCarteSortiePrison = 0;
		this.nbDouble = 0;
		this.position = 0;
		this.nbTourPrison = 0;
	}

	/**
	 * get the number of double
	 * @return number of double
	 */
	public int getNbDouble() 
	{
		return this.nbDouble;
	}

	/**
	 * update the number of double of the player
	 * @param nbDouble : number of double
	 */
	public void setNbDouble(int nbDouble) 
	{
		this.nbDouble = this.nbDouble+nbDouble;
	}

	/**
	 * get the number of card to exit from jail
	 * @return number of card to exit from jail
	 */
	public int getNbCarteSortiePrison() 
	{
		return this.nbCarteSortiePrison;
	}

	/**
	 * update the number of card to exit from jail
	 * @param nbCarteSortiePrison number of card to exit from jail
	 */
	public void setNbCarteSortiePrison(int nbCarteSortiePrison) 
	{
		this.nbCarteSortiePrison = nbCarteSortiePrison;
	}

	/**
	 * get the name of the player
	 * @return name of player
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * get the number of round in prison
	 * @return number of round in prison
	 */
	public int getNbTourPrison() 
	{
		return this.nbTourPrison;
	}

	/**
	 * get the amount on the account of the player
	 * @return amount on the account 
	 */
	public int getArgentSurLeCompte() 
	{
		return this.argentSurLeCompte;
	}

	public void setEnPrison(boolean enPrison) {
		this.enPrison = enPrison;
	}

	/**
	 * get if the player is in prison
	 * @return TRUE if he is and FALSE if isn't.
	 */
	public boolean isEnPrison() 
	{
		return this.enPrison;
	}
	
	/**
	 * change the amount of the account
	 * @param somme amount of the account
	 */
	public void changeSolde(int somme )
	{
		this.argentSurLeCompte = this.argentSurLeCompte + somme;
	}
	
	/**
	 * change the position of the player
	 * @param nbCase : number of case 
	 */
	public void deplace(int nbCase)
	{
		this.position = (this.position + nbCase) % 40;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	public int getPosition() {
		return this.position;	
	}
	
	

}

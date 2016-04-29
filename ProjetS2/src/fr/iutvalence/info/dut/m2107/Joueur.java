package fr.iutvalence.info.dut.m2107;

/**
 * define a player
 * @author Aurélien VEYRE
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

	public int getNbDouble() 
	{
		return nbDouble;
	}

	public void setNbDouble(int nbDouble) 
	{
		this.nbDouble = nbDouble;
	}

	public int getNbCarteSortiePrison() 
	{
		return nbCarteSortiePrison;
	}

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
		return name;
	}

	/**
	 * get the number of round in prison
	 * @return number of round in prison
	 */
	public int getNbTourPrison() 
	{
		return nbTourPrison;
	}

	/**
	 * get the amount on the account of the player
	 * @return amount on the account 
	 */
	public int getArgentSurLeCompte() 
	{
		return argentSurLeCompte;
	}

	/**
	 * get if the player is in prison
	 * @return TRUE if he is and FALSE if isn't.
	 */
	public boolean isEnPrison() 
	{
		return enPrison;
	}
	
	/**
	 * change the amount of the account
	 * @param somme
	 */
	public void changeSolde(int somme )
	{
		this.argentSurLeCompte = this.argentSurLeCompte + somme;
	}
	
	/**
	 * change the position of the player
	 * @param nbCase
	 */
	public void deplace(int nbCase)
	{
		this.position = (this.position + nbCase) % 40;
	}
	
	
	
	
	
	
	
	
	
	
	

}

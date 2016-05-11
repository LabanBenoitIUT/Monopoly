package fr.iutvalence.info.dut.m2107;
/**
 * represent a game
 * @author benoit laban
 *
 */
public class Partie
{
	/**
	 * NbJoueurs: number of players in the game
	 */
	private int Nbjoueurs;
	
	/**
	 * NbJoueursRestants: number of players remaining in the game 
	 */
	private int NbJoueursRestant;
	
	/**
	 * IndiceJoueurCourant: login of the current player
	 */
	private int IndiceJoueurCourant;
	
	/**
	 * Play: create a Monopoly game
	 */
	public void Play()
	{
		
	}
	
	/**
	 * get the login of the current player
	 * @return login of the player
	 */
	public int getIndiceJoueurCourant()
	{
		return IndiceJoueurCourant;
	}
	
	/**
	 * update the current player
	 * @param indiceJoueurCourant
	 */
	public void setIndiceJoueurCourant(int indiceJoueurCourant)
	{
		IndiceJoueurCourant = indiceJoueurCourant;
	}
	
	/**
	 * GerePosition: manage how to do in function of the position
	 */
	public void GerePosition(Cases Case, Joueur Joueur)
	{
		
	}
	
	/**
	 * GerePrison: manage a joueur in the jail
	 */
	public void GerePrison(Cases Case, Joueur Joueur)
	{
		
	}
	
	/**
	 * GereConstructible: manage if the current case are a Constructible case
	 */
	public void GereConstructible(Cases Case, Joueur Joueur)
	{
		
	}
	
	/**
	 * 
	 */
	

}

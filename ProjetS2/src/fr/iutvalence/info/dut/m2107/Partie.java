package fr.iutvalence.info.dut.m2107;
/**
 * represent a game
 * @author Benoit Laban 
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
	
	Cases[][] board = new Cases[10][10];
	
	public Partie()
	{
		for(int ligne = 1; ligne < 9; ligne ++ )
		{
			for(int colonne = 1; colonne < 9; colonne ++ )
			{
				this.board[ligne][colonne]=null;
			}
		}
		this.board[0][0]= new CaseDepart();
		this.board[0][9]= new CasePrison();
		this.board[9][9]= new CasePrison();
		this.board[9][0]=null;
		
	}
	
	/**
	 * Play: create a Monopoly game
	 * 
	 * algo:
	 * current player is player 1
	 * while(game is not over)
	 *  while round of current player is not over
	 *   jet de des
	 *   avance
	 *   action de la case
	 *   action du joueur( vendre, echanger,...)
	 *  switch current player
	 * game over
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
	 * executerCarte: execute the effect of the card
	 */
	public void executerCarte(Cartes carte, Joueur joueur)
	{
		
	}
	
	/**
	 * gereGare: manage if the player is on a station
	 */
	public void GereGare(Cases Case, Joueur joueur)
	{
		
	}
	
	/**
	 * GereCompagnie: manage if the player is on a company
	 */
	public void GereCompagnie(Cases Case, Joueur joueur)
	{
		
	}
	
	/**
	 * GereDouble: manage if the player get a double with the dices
	 */
	public void GereDouble(Des des, Joueur joueur)
	{
		
	}
	
	/**
	 * Vendre: allow to the player to sell a property
	 */
	public void Vendre(Cases Case, Joueur joueur)
	{
		
	}
	
	/**
	 * EchangeBiens: allow to the player to exchange a property with an other player
	 */
	public void EchangeBiens(Joueur joueur)
	{
		
	}
	
}

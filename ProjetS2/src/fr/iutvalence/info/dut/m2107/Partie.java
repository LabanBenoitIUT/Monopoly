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
	
	Cases[][] board = new Cases[11][11];
	
	public Partie()
	{
		// Initialization of every case of the board
		for(int ligne = 1; ligne < 10; ligne ++ )
		{
			for(int colonne = 1; colonne < 10; colonne ++ )
			{
				this.board[ligne][colonne]=null;
			}
		}
		this.board[0][0]= new CaseDepart();
		this.board[0][1]= new Constructible();
		this.board[0][2]= new CaseCommunaute();
		this.board[0][3]= new Constructible();
		this.board[0][4]= new CaseImpot();
		this.board[0][5]= new CaseGare();
		this.board[0][6]= new Constructible();
		this.board[0][7]= new CaseChance();
		this.board[0][8]= new Constructible();
		this.board[0][9]= new Constructible();
		this.board[0][10]= new CasePrison();
		this.board[1][0]= new Constructible();
		this.board[1][9]= new Constructible();
		this.board[2][0]= new CaseTaxe();
		this.board[2][9]= new CaseCompagnie();
		this.board[3][0]= new Constructible();
		this.board[3][9]= new Constructible();
		this.board[4][0]= new CaseChance();
		this.board[4][9]= new Constructible();
		this.board[5][0]= new CaseGare();
		this.board[5][9]= new CaseGare();
		this.board[6][0]= new Constructible();
		this.board[6][9]= new Constructible();
		this.board[7][0]= new CaseCommunaute();
		this.board[7][9]= new CaseCommunaute();
		this.board[8][0]= new Constructible();
		this.board[8][9]= new Constructible();
		this.board[9][0]= new Constructible();
		this.board[9][9]= new Constructible();
		this.board[10][0]= new CaseAllerEnPrison();
		this.board[10][9]= new CaseParcGratuit();
		this.board[10][1]= new Constructible();
		this.board[10][2]= new CaseCompagnie();
		this.board[10][3]= new Constructible();
		this.board[10][4]= new Constructible();
		this.board[10][5]= new CaseGare();
		this.board[10][6]= new Constructible();
		this.board[10][7]= new Constructible();
		this.board[10][8]= new CaseChance();
		this.board[10][9]= new Constructible();	
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
		return this.IndiceJoueurCourant;
	}
	
	/**
	 * update the current player
	 * @param indiceJoueurCourant number of the player
	 */
	public void setIndiceJoueurCourant(int indiceJoueurCourant)
	{
		this.IndiceJoueurCourant = indiceJoueurCourant;
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

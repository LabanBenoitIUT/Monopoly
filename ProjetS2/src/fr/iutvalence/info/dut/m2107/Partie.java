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
		
	private Cases[] board;
	
	private Pioche[] CaisseCommunaute;
	
	private Pioche[] Chance;
	
	//private Des Des1;
	
//	private Des Des2;
	
	private Joueur joueur2;
	
	private Joueur joueur1;
	
	public Partie(String name1, String name2)
	{
		// initialization of the board
		this.board =  new Cases[39];
		this.board[0]= new CaseDepart();
		this.board[1]= new Constructible("Boulevard de belleville", 1, 200);
		this.board[2]= new CaseCommunaute(2);
		this.board[3]= new Constructible("Boulevard de villette", 3, 200);
		this.board[4]= new CaseImpot();
		this.board[5]= new CaseGare(5, " Gare Montparnasse");
		this.board[6]= new Constructible("rue la fayette", 6, 200);
		this.board[7]= new CaseChance(7);
		this.board[8]= new Constructible("avenue de la republique", 8, 200);
		this.board[9]= new Constructible("rue de paradis", 9, 200);
		this.board[10]= new CasePrison();
		this.board[11]= new Constructible("Place de la bourse", 11, 200);
		this.board[12]= new CaseCompagnie(12,"compagnie de distribution d'electricite");
		this.board[13]= new Constructible("rue machin", 13, 200);
		this.board[14]= new Constructible("avenue de neuilly", 14, 200);
		this.board[15]= new CaseGare(15, "Gare de Lyon");
		this.board[16]= new Constructible("Place Pigalle", 16, 200);
		this.board[17]= new CaseCommunaute(17);
		this.board[18]= new Constructible("Avenue mozart", 18, 200);
		this.board[19]= new Constructible("Rue de ????", 19, 200);
		this.board[20]= new CaseParcGratuit();
		this.board[21]= new Constructible("???", 21, 200);
		this.board[22]= new CaseChance(22);
		this.board[23]= new Constructible("???", 23, 200);
		this.board[24]= new Constructible("???", 24, 200);
		this.board[25]= new CaseGare(25, "Gare du Nord");
		this.board[26]= new Constructible("???", 26, 200);
		this.board[27]= new Constructible("???", 27, 200);
		this.board[28]= new CaseCompagnie(28, "compagnie de distribution des eaux");
		this.board[29]= new Constructible("???", 29, 200);
		this.board[30]= new CaseAllerEnPrison();
		this.board[31]= new Constructible("???", 31, 200);
		this.board[32]= new Constructible("???", 32, 200);
		this.board[33]= new CaseCommunaute(33);
		this.board[34]= new Constructible("???", 34, 200);
		this.board[35]= new CaseGare(35, "Gare Saint Lazare ");
		this.board[36]= new CaseChance(36);
		this.board[37]= new Constructible("???", 37, 200);
		this.board[38]= new CaseTaxe();
		this.board[39]= new Constructible("???", 39, 200);	
		//initialization of the player
		this.joueur1 = new Joueur(name1);
		this.joueur2 = new Joueur(name1);
		//initialization of the dice
	//	this.Des1 = new Des(6);
//		this.Des2 = new Des(6);
		//initialization of the deck
		this.Chance = new Pioche[16];
		this.CaisseCommunaute = new Pioche[16];
		
		
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
		boolean gameover = false;
		boolean endOfRound = false;
		this.IndiceJoueurCourant = 1; 
		while(gameover==false)
		{
			while(endOfRound==false)
			{
				De1=Des.lancerDe();
				De2=Des.lancerDe();
				this.joueur.deplace(De1+De2);
				Cases.getType();
				
			}
			
		}
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

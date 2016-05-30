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
	 * the current player
	 */
	private Joueur JoueurCourant;
		
	/**
	 * the board
	 */
	private Cases[] board;
	
	/**
	 * the deck of CaisseCommunaute card
	 */
	private Pioche CaisseCommunaute;
	
	/**
	 * the deck of Chance card
	 */
	private Pioche Chance;
	
	/**
	 * the dice
	 */
	private Des Des;
	
	/**
	 * the player 2
	 */
	private Joueur joueur2;
	
	/**
	 * the player 1
	 */
	private Joueur joueur1;
	
	/**
	 * create a game of monopoly
	 * @param name1 : name of the player 1
	 * @param name2 : name of the player 2
	 */
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
//		this.Des2 = new Des(6);
		//initialization of the deck of lucky card
		this.Chance = new Pioche();
		this.Chance.put(new CarteChance("Gain","....",1500000));
		this.Chance.put(new CarteChance("Perte","....",500));
		this.Chance.put(new CarteChance("Perte","....",123));
		this.Chance.put(new CarteChance("Aller en prison","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Sortie de prison","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Avancer","....",0));
		this.Chance.put(new CarteChance("Reculer","....",3));
		this.Chance.put(new CarteChance("Gain","....",500));
		this.Chance.put(new CarteChance("Perte","....",150));
		//initialization of the deck of community card
		this.CaisseCommunaute = new Pioche();
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",100));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Perte","....",1000));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Perte","....",500));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Aller en prison","....",0));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Avancer","....",0));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Sortie de prison","....",0));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",500));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",1000));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",1000));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",100));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",200));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",250));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",2000));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Perte","....",500));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Gain","....",100));
		this.CaisseCommunaute.put(new CarteCaisseDeCommunaute("Perte","....",1235));
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
	public void play()
	{
		boolean endOfRound = false;
		this.JoueurCourant = this.joueur1;
		while(this.NbJoueursRestant > 1)
		{
			this.Des.lancerDes();
			this.JoueurCourant.deplace(this.Des.getValeurDes1() + this.Des.getValeurDes2());
			int pos  = this.JoueurCourant.getPosition();
			Cases cas = this.board[pos];
			ActionDeLaCase(cas.getType(), cas);
			while(endOfRound==false)
			{
				this.Des.lancerDes();
				int ValDes = this.Des.getValeurDes1()+ this.Des.getValeurDes2(); //addition of the two dice's values
				this.JoueurCourant.deplace(ValDes); //move the current player position
				cas.getType();
			}
			switchJoueurCourant();
		}
	}
	
	/**
	 * execute the action of the case 
	 * @param type : type of case
	 * @param cas : the case
	 */
	public void ActionDeLaCase(String type, Cases cas) 
	{	
		switch (type)
		{
		  case "Constructible":
			  //...
			  break;
		  case "Aller en prison":
			  	this.JoueurCourant.setPosition(10);
			  break;
		  case "Chance":
			  this.Chance.get();
			  break;
		  case "Caisse de communaute":
			  this.CaisseCommunaute.get();
			  break;
		  case "Compagnie":
			  GereCompagnie((CaseCompagnie) cas, this.JoueurCourant);
			  break;
		  case "Depart":
			  this.JoueurCourant.changeSolde(CaseDepart.getSOMME());
			  break;
		  case "Gare":
			  GereGare((CaseGare) cas, this.JoueurCourant);
			  break;
		  case "impot":
			  this.JoueurCourant.changeSolde(CaseImpot.getSomme());
			  break;
		  case "Parc Gratuit":
			  this.JoueurCourant.changeSolde(CaseParcGratuit.getSomme());
			  break;
		  case "Prison":
			  if(this.JoueurCourant.isEnPrison() == true)
			  {
				  if(this.JoueurCourant.getNbTourPrison() > 3 )
				  {
					  this.JoueurCourant.changeSolde(-500);
					  this.JoueurCourant.setEnPrison(false);
				  }
				  else
				  {
					  this.Des.lancerDes();
					  if (this.Des.isDouble(this.Des.getValeurDes1(), this.Des.getValeurDes2())==true)
					  {
						  this.JoueurCourant.setEnPrison(false);
					  }
					  	
				  }  
			  }  
			  break;
		  case "Taxe de luxe":
			  this.JoueurCourant.changeSolde(CaseTaxe.getSomme());
			  break;
		}
	}

	/**
	 * Update the current player
	 */
	public void switchJoueurCourant() 
	{
		if(this.JoueurCourant == this.joueur1)
		{
			this.joueur1 = this.JoueurCourant;
			this.JoueurCourant = this.joueur2;
		}
		else
		{
			this.joueur2 = this.JoueurCourant;
			this.JoueurCourant = this.joueur1;
		}
	}
	
	/**
	 * GerePosition: manage how to do in function of the position
	 * @param Case : the position of the player
	 * @param Joueur : the current player
	 */
	public void GerePosition(Cases Case, Joueur Joueur)
	{
		
	} 
	
	/**
	 * GerePrison: manage a player in the jail
	 * @param Case : the position of the player
	 * @param Joueur
	 */
	public void GerePrison(CasePrison Case, Joueur Joueur)
	{
		
	}
	
	/**
	 * GereConstructible: manage if the current case are a Constructible case
	 * @param Case
	 * @param Joueur
	 */
	public void GereConstructible(Constructible Case, Joueur Joueur)
	{
		
	}
	
	/**
	 * executerCarte: execute the effect of the card
	 * @param carte
	 * @param joueur
	 */
	public void executerCarte(Cartes carte, Joueur joueur)
	{
		
	}
	
	/**
	 * gereGare: manage if the player is on a station
	 * @param Case : the position of the player
	 * @param joueur : the current player
	 */
	public void GereGare(CaseGare Case, Joueur joueur)	//pas besoin de paramètre joueur, il s'agit de JoueurCourrant
	{
		if(Case.getProprietaire()!=joueur){				// de meme pour case, il s'agit de la position de JoueurCourrant
			joueur.changeSolde(-50);
			Case.getProprietaire().changeSolde(50);	
		}
	}
	
	/**
	 * GereCompagnie: manage if the player is on a company
	 * @param Case : the position of the player
	 * @param joueur
	 */
	public void GereCompagnie(CaseCompagnie Case, Joueur joueur)	//pas besoin de paramètre joueur, il s'agit de JoueurCourrant
	{
		if(Case.getProprietaire()!=joueur){
			joueur.changeSolde(-50);
			Case.getProprietaire().changeSolde(50);	
		}
	}
	
	/**
	 * GereDouble: manage if the player get a double with the dices
	 * @param des : the dice
	 * @param joueur
	 */
	public void GereDouble(Des des, Joueur joueur)	//pas besoin de paramètre, on utilisera this.Des, this.JoueurCourrant
	{
		if(this.JoueurCourant.getPosition() != 10)
		{
			if(this.Des.getValeurDes1() == this.Des.getValeurDes2())
				this.JoueurCourant.setNbDouble(1);
			if(this.JoueurCourant.getNbDouble()<=3)
				this.JoueurCourant.setPosition(10);
		}
		else
		{
			if(this.Des.getValeurDes1() == this.Des.getValeurDes2())
				this.JoueurCourant.setNbDouble(1);
			if(this.JoueurCourant.getNbDouble()<=3)
			{
				this.JoueurCourant.changeSolde(-50);
				this.JoueurCourant.setPotition(this.Des.getValeurDes1()+this.Des.getValeurDes2()+10);
			}
		}
	}
	
	/**
	 * Vendre: allow to the player to sell a property
	 * @param Case
	 * @param joueur
	 */
	public void Vendre(Cases Case, Joueur joueur)
	{
		
	}
	
	/**
	 * EchangeBiens: allow to the player to exchange a property with an other player
	 * @param joueur
	 */
	public void EchangeBiens(Joueur joueur)
	{
		
	}
	
}

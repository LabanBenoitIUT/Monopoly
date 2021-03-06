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
	private static int NbJoueursRestant;
	
	/**
	 * the current player
	 */
	private static Joueur JoueurCourant;
		
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
	 * boolean to check if the round of a player is over or not
	 */
	private static boolean endOfRound;
	
	/**
	 * setter for EndOfRound
	 * @return
	 */
	public boolean isEndOfRound() {
		return endOfRound;
	}

	/**
	 * getter for EndOfRound
	 * @param endOfRound
	 */
	public static void setEndOfRound(boolean End) {
		endOfRound = End;
	}

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
		this.board[1]= new Constructible("Boulevard de belleville", 1, 60);
		this.board[2]= new CaseCommunaute(2);
		this.board[3]= new Constructible("Rue LeCourbe", 3, 60);
		this.board[4]= new CaseImpot();
		this.board[5]= new CaseGare(5, " Gare Montparnasse");
		this.board[6]= new Constructible("Rue de Vaugirard", 6, 100);
		this.board[7]= new CaseChance(7);
		this.board[8]= new Constructible("Rue de Courcelles", 8, 100);
		this.board[9]= new Constructible("Avenue de la République", 9, 120);
		this.board[10]= new CasePrison();
		this.board[11]= new Constructible("Boulevard de la Villette", 11, 140);
		this.board[12]= new CaseCompagnie(12,"compagnie de distribution d'electricite");
		this.board[13]= new Constructible("Avenue de Neuilly", 13, 140);
		this.board[14]= new Constructible("Rue de Paradis", 14, 160);
		this.board[15]= new CaseGare(15, "Gare de Lyon");
		this.board[16]= new Constructible("Avenue de Mozart", 16, 180);
		this.board[17]= new CaseCommunaute(17);
		this.board[18]= new Constructible("Boulevard Saint-Michel", 18, 180);
		this.board[19]= new Constructible("Place Pigale", 19, 200);
		this.board[20]= new CaseParcGratuit();
		this.board[21]= new Constructible("Avenue Matignon", 21, 220);
		this.board[22]= new CaseChance(22);
		this.board[23]= new Constructible("Boulevard Malesherbes", 23, 220);
		this.board[24]= new Constructible("Avenue Henri-Martin", 24, 240);
		this.board[25]= new CaseGare(25, "Gare du Nord");
		this.board[26]= new Constructible("Faubourg Saint-Honoré", 26, 260);
		this.board[27]= new Constructible("Place de la Bourse", 27, 260);
		this.board[28]= new CaseCompagnie(28, "compagnie de distribution des eaux");
		this.board[29]= new Constructible("Rue de la Fayette", 29, 280);
		this.board[30]= new CaseAllerEnPrison();
		this.board[31]= new Constructible("Avenue de Breteuil", 31, 300);
		this.board[32]= new Constructible("Avenue Foch", 32, 300);
		this.board[33]= new CaseCommunaute(33);
		this.board[34]= new Constructible("Boulevard des Capucines", 34, 320);
		this.board[35]= new CaseGare(35, "Gare Saint Lazare ");
		this.board[36]= new CaseChance(36);
		this.board[37]= new Constructible("Avenues des Champs-Elysés", 37, 350);
		this.board[38]= new CaseTaxe();
		this.board[39]= new Constructible("Rue de la Paix", 39, 400);	
		//initialization of the player
		this.joueur1 = new Joueur(name1);
		this.joueur2 = new Joueur(name1);
		//initialization of the dice
		this.Des = new Des(); 
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
		Partie.JoueurCourant = this.joueur1;
		while(Partie.NbJoueursRestant > 1)
		{
			endOfRound=false;
			this.Des.lancerDes();
			Partie.JoueurCourant.deplace(this.Des.getValeurDes1() + this.Des.getValeurDes2());
			int pos  = Partie.JoueurCourant.getPosition();
			Cases cas = this.board[pos];
			ActionDeLaCase(cas.getType(), cas);
			while(endOfRound==false)
			{
				this.Des.lancerDes();
				int ValDes = this.Des.getValeurDes1()+ this.Des.getValeurDes2(); //addition of the two dice's values
				Partie.JoueurCourant.deplace(ValDes); //move the current player position
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
			  	Partie.JoueurCourant.setPosition(10);
			  break;
		  case "Chance":
			  this.Chance.get();
			  break;
		  case "Caisse de communaute":
			  this.CaisseCommunaute.get();
			  break;
		  case "Compagnie":
			  GereCompagnie((CaseCompagnie) cas, Partie.JoueurCourant);
			  break;
		  case "Depart":
			  Partie.JoueurCourant.changeSolde(CaseDepart.getSOMME());
			  break;
		  case "Gare":
			  GereGare((CaseGare) cas, Partie.JoueurCourant);
			  break;
		  case "impot":
			  Partie.JoueurCourant.changeSolde(CaseImpot.getSomme());
			  break;
		  case "Parc Gratuit":
			  Partie.JoueurCourant.changeSolde(CaseParcGratuit.getSomme());
			  break;
		  case "Prison":
			  if(Partie.JoueurCourant.isEnPrison() == true)
			  {
				  if(Partie.JoueurCourant.getNbTourPrison() > 3 )
				  {
					  Partie.JoueurCourant.changeSolde(-500);
					  Partie.JoueurCourant.setEnPrison(false);
				  }
				  else
				  {
					  this.Des.lancerDes();
					  if (this.Des.isDouble(this.Des.getValeurDes1(), this.Des.getValeurDes2())==true)
					  {
						  Partie.JoueurCourant.setEnPrison(false);
					  }
					  	
				  }  
			  }  
			  break;
		  case "Taxe de luxe":
			  Partie.JoueurCourant.changeSolde(CaseTaxe.getSomme());
			  break;
		}
	}

	/**
	 * Update the current player
	 */
	public void switchJoueurCourant() 
	{
		if(Partie.JoueurCourant == this.joueur1)
		{
			this.joueur1 = Partie.JoueurCourant;
			Partie.JoueurCourant = this.joueur2;
		}
		else
		{
			this.joueur2 = Partie.JoueurCourant;
			Partie.JoueurCourant = this.joueur1;
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
	public void GereGare(CaseGare Case, Joueur joueur)
	{
		if(Case.getProprietaire()!=joueur){
			joueur.changeSolde(-50);
			Case.getProprietaire().changeSolde(50);	
		}
	}
	
	/**
	 * GereCompagnie: manage if the player is on a company
	 * @param Case : the position of the player
	 * @param joueur : the player
	 */
	public void GereCompagnie(CaseCompagnie Case, Joueur joueur)
	{
		if(Case.getProprietaire()!=joueur){
			joueur.changeSolde(-50);
			Case.getProprietaire().changeSolde(50);	
		}
		
	}
	
	/**
	 * GereDouble: manage if the player get a double with the dices
	 */
	public void GereDouble()
	{
		if(Partie.JoueurCourant.getPosition() != 10)
		{
			if(this.Des.getValeurDes1() == this.Des.getValeurDes2())
				Partie.JoueurCourant.setNbDouble(1);
			if(Partie.JoueurCourant.getNbDouble()<=3)
				Partie.JoueurCourant.setPosition(10);
		}
		else
		{
			if(this.Des.getValeurDes1() == this.Des.getValeurDes2())
				Partie.JoueurCourant.setNbDouble(1);
			if(Partie.JoueurCourant.getNbDouble()<=3)
			{
				Partie.JoueurCourant.changeSolde(-50);
				Partie.JoueurCourant.setPosition(this.Des.getValeurDes1()+this.Des.getValeurDes2()+10);

			}
		}
	}
	
	/**
	 * Vendre: allow to the player to sell a property
	 * @param Case
	 * @param joueur
	 */
	public void Vendre(CasePropriete Case, Joueur joueuracheteur, int prixvente)
	{
		JoueurCourant.changeSolde(prixvente);
		joueuracheteur.changeSolde(-prixvente);
		Case.setProprietaire(joueuracheteur);
	}
			

	
	/**
	 * EchangeBiens: allow to the player to exchange a property with an other player
	 * @param joueur
	 */
	public void EchangeBiens(Joueur joueur)
	{
		
	}
	
	public void Acheter(CasePropriete Case, Joueur joueur){
		joueur.changeSolde(-Case.getValeurAchat());
		Case.setProprietaire(joueur);
	}

	public static Joueur getJoueurCourant()
	{
		return JoueurCourant;
	}

	/**
	 * @param nbJoueursRestant the nbJoueursRestant to set
	 */
	public void setNbJoueursRestant() {
		if(this.joueur1.isEstDansLaPartie()== false)
			NbJoueursRestant = 1;
		else if(this.joueur2.isEstDansLaPartie()== false)
			NbJoueursRestant = 2;
		}
}

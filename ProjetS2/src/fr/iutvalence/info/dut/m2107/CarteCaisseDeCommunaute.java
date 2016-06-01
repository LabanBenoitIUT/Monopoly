package fr.iutvalence.info.dut.m2107;
/**
 * Community chest card of a Monopoly Game
 * @author canseva
 *
 */
public class CarteCaisseDeCommunaute extends Cartes
{
	/**
	 * create a card CaissDeCommunauté 
	 * @param type : type of the card
	 * @param texte : text of the card
	 * @param valeur : number of the card
	 */
	public CarteCaisseDeCommunaute(String type, String texte, int valeur)
	{
		this.type = type;
		this.texte = texte;
		this.valeur = valeur;
	}
	/**
	 * Method which execute the card's instruction	
	 */
	public void executer()
	{
		switch(this.type)
		{
		case "Gain":
			Partie.getJoueurCourant().changeSolde(this.valeur);
			break;
		case "Perte":
			Partie.getJoueurCourant().changeSolde(-this.valeur);
			break;
		case "Avancer":
			Partie.getJoueurCourant().deplace(this.valeur);
			break;
		case "Aller en prison":
			Partie.getJoueurCourant().setPosition(this.valeur);
			break;
		case "Sortie de prison":
			Partie.getJoueurCourant().setEnPrison(false);
			break;
		}	
	}
}
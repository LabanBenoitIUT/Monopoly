package fr.iutvalence.info.dut.m2107;

/**
 * Lucky card of a Monopoly Game
 * @author canseva
 *
 */
public class CarteChance extends Cartes
{
	/**
	 * create a card Chance
	 * @param type : type of the card
	 * @param texte : text of the card
	 * @param valeur : number of the card
	 */
	public CarteChance(String type, String texte, int valeur)
	{
		this.type = type;
		this.texte = texte;
		this.valeur = valeur;		
	}

/**
 * Method which execute the card's instructions	
 */
	public void executer()
	{
		
	}
	
}


package fr.iutvalence.info.dut.m2107;

/**
 * Lucky card of a Monopoly Game
 * @author canseva
 *
 */
public class CarteChance extends Cartes
{
	public CarteChance(String texte, int valeur)
	{
		this.type = "Chance";
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

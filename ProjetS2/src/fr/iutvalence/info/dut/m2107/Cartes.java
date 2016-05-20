package fr.iutvalence.info.dut.m2107;

/**Cards of a Monopoly Game
 * @author canseva
 *
 */
public abstract class Cartes{

	/**Attribute which represents the type of a card
	 * 
	 */
	protected String type;
	
	/**
	 * The text written on the card
	 */
	protected String texte;
	
	/**
	 * Value of the card
	 */
	protected int valeur;
	
	/**
	 * Used to get the type of a card
	 * @return the type of a card
	 */
	
	public String getType()
	{
		return this.type;
	}
	
	/**
	 * Used to get the text of a card
	 * @return the text of a card
	 */
	public String getTexte()
	{
		return this.texte;
	}
	
	/**
	 * Used to get the value of a card
	 * @return the value of a card
	 */
	public int getValeur()
	{
		return this.valeur;
	}

	/**
	 * draw a card
	 */
	public void piocherCarte()
	{
		
	}
}






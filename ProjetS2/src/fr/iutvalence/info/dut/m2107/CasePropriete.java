package fr.iutvalence.info.dut.m2107;

/**The property case of a Monopoly Game
 * @author canseva
 *
 */
public abstract class CasePropriete extends Cases
{

		
	/**
	 * Show if a property case is mortgaged or not	
	 */
	private boolean hypotheque;
	/**
	 * The buying value of a property case
	 */
	private int valeurAchat;
	/**
	 * The mortgage value of a property case
	 */
	private int valeurHypotheque;
	/**
	 * The number of property that have the same color
	 */
	private int nbProprieteMemeCouleur;
	/**
	 * the color of a property
	 */
	private String couleur;
	/**
	 * Owner of the property 
	 */
	private Joueur proprietaire;
	
	/**
	 * Used to get the value of the attribute hypotheque 
	 * @return boolean 
	 */
	public boolean isHypotheque()
	{
		return this.hypotheque;
	}
	/**
	 * used to get the value of the attribute valeur achat
	 * @return the purchase value
	 */
	public int getValeurAchat()
	{
		return this.valeurAchat;
	}
	/**
	 * used to get the mortgage value
	 * @return the mortgage value
	 */
	public int getValeurHypotheque()
	{
		return this.valeurHypotheque;
	}
	/**
	 * used to get the number of property that have the same color
	 * @return the number of property that have the same color
	 */
	public int getNbProprieteMemeCouleur()
	{
		return this.nbProprieteMemeCouleur;
	}
	/**
	 * used to get the color of a property
	 * @return the color of the property
	 */
	public String getCouleur()
	{
		return this.couleur;
	}
	/**
	 * used to get the owner of a property
	 * @return the owner of the property
	 */
	public Joueur getProprietaire()
	{
		return this.proprietaire;
	
	}
}


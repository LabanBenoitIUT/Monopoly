package fr.iutvalence.info.dut.m2107;

/**The property case of a Monopoly Game
 * @author canseva
 *
 */
public class CasePropriete extends Cases
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
private Joueur propriétaire;

/**
 * Used to get the value of the attribute hypotheque 
 * @return boolean 
 */
public boolean isHypotheque()
{
	return hypotheque;
}
public int getValeurAchat()
{
	return valeurAchat;
}
public int getValeurHypotheque()
{
	return valeurHypotheque;
}
public int getNbProprieteMemeCouleur()
{
	return nbProprieteMemeCouleur;
}
public String getCouleur()
{
	return couleur;
}
public Joueur getPropriétaire()
{
	return propriétaire;

}

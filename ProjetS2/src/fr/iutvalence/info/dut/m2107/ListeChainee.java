/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

/**
 * @author aurélien
 *
 */
public class ListeChainee {

	private Cases valeur;
	
	private Cases suivant;
	
	public ListeChainee(Cases valeur )
	{
		this.valeur = valeur;
		this.suivant = null;
	}
	
	public ListeChainee(Cases valeur , Cases suivant)
	{
		this.valeur = valeur;
		this.suivant = suivant;
	}	
}
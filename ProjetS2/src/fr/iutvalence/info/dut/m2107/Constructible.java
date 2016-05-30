package fr.iutvalence.info.dut.m2107;

/**
 * @author canseva
 *Building case of a Monopoly Game
=======
/**
 * represent a building property
 * @author Benoit Laban
 *
>>>>>>> branch 'master' of https://github.com/LabanBenoitIUT/Monopoly.git
 */
public class Constructible extends CasePropriete
{
	
	/**
	 * the price of a building case
	 */
	private int prixConstruction;
	/***
	 * number of building cases
	 */
	private int nbConstruction;
	
	public Constructible(String nom, int position, int prixConstruction)
	{
		this.type = "Constructible";
		this.position = position;
		this.nom = "nom";
		this.prixConstruction = prixConstruction;
		this.nbConstruction = 0;
		this.proprietaire=null;
	}
	
	/**
	 * used to get the price of a building case
	 * @return the price of the building case
	 */
	public int getPrixConstruction()
	{
		return prixConstruction;
	}
	/**
	 * used to get the number of building cases
	 * @return number of building cases 
	 */
	public int getNbConstruction()
	{
		return nbConstruction;
	}


}

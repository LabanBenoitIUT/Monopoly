package fr.iutvalence.info.dut.m2107;
/**
 * define a tax case
 * @author labanb
 *
 */
public class CaseTaxe extends Cases
{
	/**
	 * the cost of the box
	 */
	private final int somme;
	
	/**
	 * constructor of this class
	 */
	public CaseTaxe() 
	{
		this.somme = 100;
	}

	/**
	 * get the amount of somme
	 * @return the amount
	 */
	public int getSomme()
	{
		return this.somme;
	}
}

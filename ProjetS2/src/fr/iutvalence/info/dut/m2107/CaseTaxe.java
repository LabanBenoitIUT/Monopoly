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
	private final static int somme = 100;
	
	/**
	 * constructor of this class
	 */
	public CaseTaxe() {
		this.nom ="Taxe de luxe";
		this.position = 38;
		this.type  = "Taxe";
	}

	/**
	 * get the amount of somme
	 * @return the amount
	 */
	public static int getSomme()
	{
		return somme;
	}
}

package fr.iutvalence.info.dut.m2107;
/**
 * case pay a tax
 * @author Benoit Laban
 *
 */
public class CaseImpot extends Cases
{
	/**
	 * the cost of the box
	 */
	private final static int somme = -150;
	
	/**
	 * constructor of the case CaseImpot
	 */
	public CaseImpot() {
		this.type = "impot";
		this.position = 4;
		this.nom = "impot";
	}

	/**
	 * get the amount of tax
	 * @return the amount
	 */
	public static int getSomme()
	{
		return somme;
	}

}

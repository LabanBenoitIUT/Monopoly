package fr.iutvalence.info.dut.m2107;
/**
 * case pay a tax
 * @author labanb
 *
 */
public class CaseImpot extends Cases
{
	/**
	 * the cost of the box
	 */
	private final int somme;
	
	/**
	 * @param somme
	 */
	public CaseImpot() {
		this.type = "impot";
		this.position = 4;
		this.nom = "impot";
		this.somme = 150 ;
	}

	/**
	 * get the amount of somme
	 * @return the amount
	 */
	public int getSomme()
	{
		return somme;
	}

}

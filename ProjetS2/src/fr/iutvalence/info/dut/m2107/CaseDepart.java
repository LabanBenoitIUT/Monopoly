package fr.iutvalence.info.dut.m2107;
/**
 * case Start
 * @author labanb
 *
 */
public class CaseDepart extends Cases 
{
	/**
	 * the amount of the gain
	 */
	private final static int SOMME = 200;

	/**
	 * get the amount of the gain
	 * @return the amount
	 */
	public static int getSOMME() {
		return SOMME;
	}
	
	/**
	 * create a case Depart
	 */
	public CaseDepart()
	{
		this.type = "Depart";
		this.position = 0;
		this.nom = "Depart";
	}
}

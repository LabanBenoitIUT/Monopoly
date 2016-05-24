package fr.iutvalence.info.dut.m2107;
/**
 * define a case station
 * @author labanb
 *
 */
public class CaseGare extends CasePropriete 
{
	/**
	 * amount of the rent
	 */
	private int loyer;
	
	public CaseGare(int position, String nom)
	{
		this.type = "Gare";
		this.position = position;
		this.nom = nom;
		this.loyer = 50;
	}

	/**
	 * get the rent
	 * @return the cost of the rent
	 */
	public int getLoyer()
	{
		return this.loyer;
	}
	
}

package fr.iutvalence.info.dut.m2107;
/**
 * cases company
 * @author labanb
 *
 */
public class CaseCompagnie extends CasePropriete 
{
	/**
	 * amount of the rent
	 */
	private int loyer;;
	

	/**
	 * 
	 */
	public CaseCompagnie(int position, String nom) {
		this.type = "Compagnie";
		this.position = position;
		this.nom = nom;
		this.loyer = 50;
		this.valeurAchat=150;
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

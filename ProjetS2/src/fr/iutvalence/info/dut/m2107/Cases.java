package fr.iutvalence.info.dut.m2107;
/**
 * abstract class of cases
 * @author labanb
 *
 */
public abstract class Cases 
{
	protected String type;
	protected int position;
	protected String nom;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return the name
	 */
	public String getTNom() {
		return this.nom;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return this.position;
	}
}

package fr.iutvalence.info.dut.m2107;
/**
 * define the ParcGratruit 
 * @author labanb
 *
 */
public class CaseParcGratuit extends Cases 
{
	/**
	 * somme: how much money in the ParcGratuit
	 */
	private int somme;
	
	/**
	 * get the amount in the ParcGratuit
	 * @return somme
	 */
	public int getSomme()
	{
		return somme;
	}
	
	/**
	 * update the amount of money in the ParcGratuit
	 * @param i : amount of money
	 */
	public void setSomme(int somme)
	{
		this.somme = somme;
	}

}

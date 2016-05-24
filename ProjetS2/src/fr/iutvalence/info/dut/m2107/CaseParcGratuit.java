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
	
	public CaseParcGratuit()
	{
		this.type = "Parc Gratuit";
		this.position = 20;
		this.nom = "Parc Gratuit";
		this.somme = 0;
	}
	/**
	 * get the amount in the ParcGratuit
	 * @return somme
	 */
	public int getSomme()
	{
		return this.somme;
	}
	
	/**
	 * update the amount of money in the ParcGratuit
	 * @param somme the amount in the ParcGratuit
	 */
	public void setSomme(int somme)
	{
		this.somme = somme;
	}

}

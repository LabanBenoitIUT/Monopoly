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
	private static int Somme;
	
	/**
	 * create the case CaseParcGratuit 
	 */
	public CaseParcGratuit()
	{
		this.type = "Parc Gratuit";
		this.position = 20;
		this.nom = "Parc Gratuit";
		Somme = 0;
	}
	/**
	 * get the amount in the ParcGratuit
	 * @return somme
	 */
	public static int getSomme()
	{
		return Somme;
	}
	
	/**
	 * update the amount of money in the ParcGratuit
	 * @param somme the amount in the ParcGratuit
	 */
	public void setSomme(int somme)
	{
		Somme = somme;
	}

}

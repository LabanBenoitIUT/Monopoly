package fr.iutvalence.info.dut.m2107;

public class CaseTaxe extends Cases
{
	/**
	 * the cost of the box
	 */
	private final int somme;
	
	
	
	public CaseTaxe() {
		this.somme = 100;
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

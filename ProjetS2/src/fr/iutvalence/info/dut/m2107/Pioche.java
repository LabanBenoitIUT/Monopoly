/**
 * 
 */
package fr.iutvalence.info.dut.m2107;

import EmptyQueueException;
import FullQueueException;
import Message;

/**
 * @author aur�lien
 *
 */
public class Pioche 
{
	/**
	 * 
	 */
	private int size;
	
	/**
	 * 
	 */
	private Cartes[] pioche;
	
	/**
	 * 
	 */
	private final int DEFAULT_CAPACITY = 16;
	
	/**
	 * 
	 */
	public Pioche()
	{
		this.pioche = new Cartes[DEFAULT_CAPACITY];
		this.size = 0;	
	}

	/**
	 * Add a message to queue (at the end)
	 * @param message the message to add
	 * @throws FullQueueException when message can not be added because queue was full
	 */
	public void put(Cartes carte)
	{
		if (this.size == this.DEFAULT_CAPACITY) throw new FullPiocheException();
		
		this.pioche[this.size++] = carte;
	}
	
	/**
	 * Remove a message from queue (at the beginning)
	 * @return the removed message
	 * @throws EmptyQueueException when message can not be removed because queue was empty
	 */
	public Cartes get() throws EmptyPiocheException
	{
		this.size = this.size - 1;
		if (this.size < 0) throw new EmptyPiocheException();
		Cartes carte = this.pioche[this.size];
		if (carte.type != "Sortir de prison")
			ActiveCarte();
			// a d�placer dans ActiveCarte 
			//for (int CarteIndex=this.size - 1; CarteIndex < 1; CarteIndex--)
			//this.pioche[CarteIndex] = this.pioche[CarteIndex + 1];
			//this.pioche[0]= carte;
			//this.size ++ ;
		else 
			return carte;
	}
}


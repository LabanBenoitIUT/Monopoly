package fr.iutvalence.info.dut.m2107;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructibleTest {

	@Test
	public void testGetPrixConstruction() {
		Constructible C1 = new Constructible("c1",50,500);
		int value =C1.getPrixConstruction();
		assertTrue(value==500);
		assertFalse(value!=500);
		
	}
	@Test
	public void testGetNbConstruction()
	{
		Constructible C1 = new Constructible("c1",50,500);
		int value =C1.getNbConstruction();
		assertTrue(value==0);
		assertFalse(value!=0);
	}

}

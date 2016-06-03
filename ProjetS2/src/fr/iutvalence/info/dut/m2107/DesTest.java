package fr.iutvalence.info.dut.m2107;

import static org.junit.Assert.*;

import org.junit.Test;

public class DesTest {

	@Test
	public void testIsDouble() {
		Des De1=new Des();
		De1.lancerDes();
		assertFalse(De1.isDouble(De1.getValeurDes1(),De1.getValeurDes2()));
		}
	
	@Test
	public void testGetValeurDes1()
	{
		Des De1=new Des();
		int value = De1.getValeurDes1();
		assertFalse(value!=0);
		assertTrue(value==0);
		
		
	}
	@Test
	public void testGetValeurDes2()
	{
		Des De1=new Des();
		int value = De1.getValeurDes1();
		assertFalse(value!=0);
		assertTrue(value==0);
	}

	@Test
	public void testLancerDes()
	{
		Des De1=new Des();
		De1.lancerDes();
		int value1 = De1.getValeurDes1();
		int value2 = De1.getValeurDes2();
		assertFalse(value1<1);
		assertFalse(value2<1);
		assertFalse(value1>6);
		assertFalse(value2>6);
		assertTrue(value1>=1 && value1<=6);
		assertTrue(value2>=1 && value2<=6);
		
	}

}

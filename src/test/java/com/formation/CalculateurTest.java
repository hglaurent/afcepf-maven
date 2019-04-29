package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculateurTest 
{
	private static Calculateur calcul = null;
	
	@BeforeAll
	public static void init()
	{
		calcul = new Calculateur();
	}
	
	@Test
	public void addTest()
	{
		assertEquals(5, calcul.add(2, 3), "Add not ok !");
	}

	@Test
	public void multTest()
	{
		assertEquals(6, calcul.mult(2, 3), "Multiply not ok !");
	}
	
	@Test
	public void divTest()
	{
		assertEquals(5, calcul.div(15, 3), "Division not ok !");
	}
}

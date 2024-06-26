package com.mavendemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		cal=null;
	}

	@Test
	public void test() {
		assertEquals(7, cal.add(3, 4));
	}

}

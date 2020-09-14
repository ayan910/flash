package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Multiply;

public class MultiplyTest {
	
	private Multiply marth;
	
	@Before
	public void init() {
		marth = new Multiply();
	}
	
	@Test
	public void testMul() {
		assertEquals(10, marth.mul(5, 2));
	}
}

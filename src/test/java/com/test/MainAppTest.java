package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	
	@Test
	public void testAddition() {
		MainApp map=new MainApp();
		int result =map.addition(8, 6);
		assertEquals(14, result);
	}
	
	@Test
	public void testMultiplication() {
		MainApp map=new MainApp();
		int result=map.multiplication(3, 5);
		assertEquals(15,result);
	}

	

}

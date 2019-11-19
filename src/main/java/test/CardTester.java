package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import data.Card;

class CardTester {

	public static final String name = "Joe Smith";
	public static final String longCardNumber = "12345678901234567";
	public static final String shortCardNumber = "123456789012345";
	public static final String goodCardNumber = "1234567890123437";
	public static final String expDateOne = "1010";
	public static final String expDateTwo = "1119";
	public static final String goodExpDate = "1120";
	public static final String goodExpDateTwo = "1219";
	public static final int secCodeOne = 23;
	public static final int secCodeTwo = 5342;
	public static final int goodSecCode = 345;
	
	
	@Test
	void cardLongNumberTest(Card card){
		Card longNumber = new Card(name, longCardNumber, goodExpDate, goodSecCode);
		assertTrue(Card.reject);
	}//end cardLongNumberTest
	
	@Test
	void cardShortNumberTest(Card card) {
		Card shortNumber = new Card(name, shortCardNumber, goodExpDate, goodSecCode);
		assertTrue(Card.reject);
	}//end cardShortNumberTest
	
	@Test
	void badExpOneTest(Card card) {
		Card badExpOne = new Card(name, goodCardNumber, expDateOne, goodSecCode);
		assertTrue(Card.reject);
	}//end badExpOneTest		
		
	@Test
	void badExpTwoTest(Card card) {
		Card badExpTwo = new Card(name, goodCardNumber, expDateTwo, goodSecCode);
		assertTrue(Card.reject);
	}//end badExpTwoTest
	
	@Test
	void badSecCodeOneTest(Card card) {
		Card badSecOne = new Card(name, goodCardNumber, goodExpDate, secCodeOne);
		assertTrue(Card.reject); 
	}//end badSecCodeOneTest
	
	@Test
	void badSecCodeTwoTest(Card card) { 
		Card badSecTwo = new Card(name, goodCardNumber, goodExpDate, secCodeTwo);
		assertTrue(Card.reject);
	}//end badSecCodeTwoTest
	
	@Test
	void goodCardTest(Card card) {
		Card lastOne = new Card(name, goodCardNumber, goodExpDateTwo, goodSecCode);
		assertFalse(Card.reject); 
	}//end goodCardTest
}//end test class
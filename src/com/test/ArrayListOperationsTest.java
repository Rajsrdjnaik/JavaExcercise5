package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import com.main.ArrayListOperations;
import org.junit.jupiter.api.Test;

class ArrayListOperationsTest {

	@Test
	void test() {
		
		ArrayListOperations obj = new ArrayListOperations();
		ArrayList<String> actual = new ArrayList<String>();
		actual.add("Apple");actual.add("Grape");actual.add("Melon");actual.add("Berry");
		ArrayList<String> expected = obj.arrayUpdate(actual);
		ArrayList<String> expected2 = new ArrayList<String>();
		expected2.add("Kiwi");expected2.add("Grape");expected2.add("Mango");expected2.add("Berry");
		assertEquals(expected2, expected);
	}
	
	@Test
	void test2() {
		
		ArrayListOperations obj = new ArrayListOperations();
		ArrayList<String> actual = new ArrayList<String>();
		actual.add("Apple");actual.add("Grape");actual.add("Melon");actual.add("Berry");
		ArrayList<String> expected = obj.arrayClear(actual);
		ArrayList<String> expected2 = new ArrayList<String>();
		assertEquals(expected2, expected);
	}

}

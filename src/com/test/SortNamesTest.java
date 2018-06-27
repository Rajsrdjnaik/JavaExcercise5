package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import com.main.SortNames;
class SortNamesTest {

	@Test
	void test() {
		
		SortNames obj = new SortNames();
		Set<String> given = new HashSet<>();
		given.add("Harry"); given.add("Olive");given.add("Eugene");  
		given.add("Alice"); given.add("Bluto"); 
		ArrayList<String> actual = obj.sortNames(given);
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Alice");expected.add("Bluto");expected.add("Eugene");expected.add("Harry");expected.add("Olive");
		assertEquals(expected, actual);
	}

}

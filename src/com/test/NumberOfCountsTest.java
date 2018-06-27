package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import com.main.NumberOfCounts;
import org.junit.jupiter.api.Test;

class NumberOfCountsTest {

	@Test
	void test() {
		NumberOfCounts obj = new NumberOfCounts();
		Map< String,Integer> expected = obj.findIndexes("one one one two three one three one two");
		Map< String,Integer> actual = new HashMap< String,Integer>();
		actual.put("one", 5);
		actual.put("two", 2);
		actual.put("three", 2);
		assertEquals(expected, actual);
	}

}

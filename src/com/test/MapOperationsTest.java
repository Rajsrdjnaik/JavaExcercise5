package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import com.main.MapOperations;
class MapOperationsTest {

	@Test
	void test() {
		Map<String,String> given = new HashMap<>();
		MapOperations obj = new MapOperations();
		given.put("val1", "java");
		given.put("val2", "C++");
		Map<String,String> actual = obj.modify(given);
		Map<String,String> expected = new HashMap<>();
		expected.put("val1", " ");
		expected.put("val2", "java");
		assertEquals(expected,actual);
	}
	
}

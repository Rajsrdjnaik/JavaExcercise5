package com.test;
import com.main.MoreThanTwo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class MoreThanTwoTest {

	@Test
	void test() {

		MoreThanTwo obj = new MoreThanTwo();
		String arr[] = {"a","b","c","d","a","c","c"};
		HashMap<String, Boolean> actual = obj.assign(arr);
        HashMap<String,Boolean> bool = new HashMap<String, Boolean>();
        bool.put("a", true);
        bool.put("b", false);
        bool.put("c", true);
        bool.put("d", false);
        assertEquals(bool, actual);
	}

}

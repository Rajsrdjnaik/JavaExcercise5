package com.main;

import java.util.Map;

public class MapOperations {

	public Map<String,String> modify(Map<String,String> str){
		
		str.put("val1", " ");
		str.put("val2", "java");
		return str;
		
	}
}

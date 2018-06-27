package com.main;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounts {

public Map< String,Integer> findIndexes ( String str ) {
		
		String str1 = "one";
		String str2 = "two";
		String str3 = "three";
		Pattern p1 = Pattern.compile(str1);
		Pattern p2 = Pattern.compile(str2);
		Pattern p3 = Pattern.compile(str3);
		Matcher m1 = p1.matcher(str);
		Matcher m2= p2.matcher(str);
		Matcher m3 = p3.matcher(str);
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		while( m1.find() ) {
			count1++;}
		while( m2.find() ) { 
			count2++;}
		while( m3.find() ) { 
			count3++;}
		Map< String,Integer> hm = new HashMap< String,Integer>();
		hm.put(str1, count1);
		hm.put(str2, count2);
		hm.put(str3, count3);
		return hm;
		
	}
}

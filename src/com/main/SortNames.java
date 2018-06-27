package com.main;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortNames {

	public ArrayList<String> sortNames(Set<String> str){
		
        Set<String> sortSet = new TreeSet<String>(str);
        System.out.println(sortSet);
    	ArrayList<String> list = new ArrayList<String>(sortSet);
		return list;
		
	}

}

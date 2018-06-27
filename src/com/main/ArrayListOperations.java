package com.main;
import java.util.ArrayList;

public class ArrayListOperations {
   public ArrayList<String> arrayUpdate(ArrayList<String> a) {
	a.set(0, "Kiwi");
	a.set(2, "Mango" );
	for(String el : a){
		System.out.println(el);
	}
	return a;
   }
   
   public ArrayList<String> arrayClear(ArrayList<String> a){
	   a.clear();
	   return a;
   }
}

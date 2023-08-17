package com.javacourse.tips.anonymousclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
class LengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}
	
}
*/
public class AnonymousClass {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>(List.of("1","2","3"));
		//Collections.sort(list, new Comparator());
		
	}

}

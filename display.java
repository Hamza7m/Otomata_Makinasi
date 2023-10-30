package _20670310030HamzaIdrissa;

import java.util.ArrayList;
import java.util.HashMap;

public class display {

	void dip(ArrayList<String> A) {
		for (String i : A) {
			System.out.println(i);
		}
	}
	void dipNump(Integer[] A) {
		for (Integer i : A) {
			System.out.println("in/out:" + i);
		}
	}
	void dip(String[] A) {
		for (String i : A) {
			System.out.println(i);
		}
	}
	
	void dip(HashMap A) {
		for (Object i : A.values()) {
		  System.out.println(i);
		}
	
	}
	
	
}

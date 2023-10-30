package _20670310030HamzaIdrissa;

import java.util.*;
import _20670310030HamzaIdrissa.*;


public class Divider {
	ArrayList<String> Array;
   States oku  = new States();
   _20670310030_Okuma read  = new _20670310030_Okuma();
	Divider(ArrayList<String> A) {
		this.Array = A;
	}
	Map<String ,Map<Integer, String> > Durum = new  HashMap<String ,Map<Integer, String>>();
	HashMap<Integer,String> TQ = new  HashMap<Integer , String>();
	HashMap<Integer,String> Outer = new  HashMap<Integer , String>();

	ArrayList<String> list() {

		for (int i = 0; i < Array.size(); i++) {
			if (Array.get(i).isEmpty()) {
				Array.remove(i);
			}
		}
		return Array;
	};

	void divFun() {

		String[] temp = list().toArray(new String[list().size()]);
		String[] current;
	
		for (int j = 0; j < temp.length; j++) {
			current = temp[j].split(",");
			TQ.put(j , current[0].trim());
			Outer.put(  j ,current[1].trim());
		}
     
	};
	
	void counqire() {
		int counter = TQ.size();
      for (int i = 0  ; i<TQ.size() ; i++) {
    	 System.out.println(i + "." +TQ.get(i));
      }
		
	}
}

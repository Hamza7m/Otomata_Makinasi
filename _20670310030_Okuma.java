package _20670310030HamzaIdrissa;

import java.util.*;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors

public class _20670310030_Okuma {
	ArrayList<String> A = new ArrayList<String>(); // Read all the FST.Txt and save it here  
	HashMap<Integer, String> trspLin = new HashMap<Integer, String>();// silenebilir gereksiz
	int strFirst; // the index of spisifice charachter 
	ArrayList<String> durumlar = new ArrayList<String>();
	String[] trspDiv;// reading the transpotion line and then slice it 

	void okuma() {

		try {

			File myObj = new File("FST");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				if (data.contains("{")) {
					strFirst = data.indexOf('{');
					A.add(data.substring(strFirst + 1, data.length() - 1).strip());
				} else if (data.contains("(")) {
					strFirst = data.indexOf('(');
					String str = data.substring(strFirst).trim().strip();
					trspLin.put(A.size(), str);
					A.add(data.substring(strFirst).trim());
					trspDiv = str.split("[()]+");
					for (int j = 0; j < trspDiv.length; j++) {
						durumlar.add(trspDiv[j].trim());
					}

				} else if (data.contains("=")) {
					strFirst = data.indexOf('=');
					A.add(data.substring(strFirst + 1).trim());
				} else {
					A.add(data.substring(2).strip().trim());
				}
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	};

}

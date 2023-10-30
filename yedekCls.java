package _20670310030HamzaIdrissa;

import java.util.*;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class yedekCls {
	ArrayList<String> A = new ArrayList<String>();
	HashMap<Integer, String> Sates = new HashMap<Integer, String>();
	int strFirst;
	String FirstState;
	ArrayList<String> durumlar = new ArrayList<String>();
	ArrayList<String> TQ = new ArrayList<String>();
	ArrayList<String> Outer = new ArrayList<String>();
	String[] arr;
	int target;
	int i = 0;

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
					Sates.put(A.size(), str);
					A.add(data.substring(strFirst).trim());

					// ----------------------- [a-zA-z].*@.*\.\w+
					/// ([(^)$])+
					arr = str.split("[()]+");
					for (int j = 0; j < arr.length; j++) {
						durumlar.add(arr[j].trim());
					}

				} else if (data.contains("=")) {
					strFirst = data.indexOf('=');
					A.add(data.substring(strFirst + 1).trim());
				} else {
					A.add(data.substring(2).strip().trim());
				}

//				System.out.println(data);

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	};

	String[] State(String A) {
		String[] States = A.split(",");
		FirstState = States[0];
		return States;
	}

	Integer[] input(String A) {
		String[] str = A.split(",");
		Integer[] inputs = new Integer[str.length];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = Integer.parseInt(str[i].trim());
		}
		return inputs;
	}

	Integer[] Output(String A) {
		String[] str = A.split(",");
		Integer[] Outputs = new Integer[str.length];
		for (int i = 0; i < Outputs.length; i++) {
			Outputs[i] = Integer.parseInt(str[i].trim());
		}
		return Outputs;

	}

	ArrayList<String> lst() {
//		durumlar.removeAll(Arrays.asList(null,""));
		ArrayList<String> B = durumlar;
		for (int i = 0; i < B.size(); i++) {
			if (B.get(i).isEmpty()) {
				B.remove(i);
			}
		}

		return B;
	}

	void divider() {
		
		//we have change function from Strin[] to void
        //durumlar.removeAll(Arrays.asList(null,""));
		
		String[] temp = lst().toArray(new String[lst().size()]);
		String[] current;
		for (int i = 0; i < temp.length; i++) {
			current = temp[i].split(",");
			TQ.add(current[0].trim());
			Outer.add(current[1].trim());
		}

	}

}
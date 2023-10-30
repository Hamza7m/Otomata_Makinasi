package _20670310030HamzaIdrissa;

public class Outputs {
	
	Integer[] Output(String A) {
		String[] str = A.split(",");
		Integer[] Outputs = new Integer[str.length];
		for (int i = 0; i < Outputs.length; i++) {
			Outputs[i] = Integer.parseInt(str[i].trim());
		}
		return Outputs;

	}
	
}

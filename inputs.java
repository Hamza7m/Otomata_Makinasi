package _20670310030HamzaIdrissa;

public class inputs {
	Integer[] input(String A) {
		String[] str = A.split(",");
		Integer[] inputs = new Integer[str.length];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = Integer.parseInt(str[i].trim());
		}
		return inputs;
	}
}

package _20670310030HamzaIdrissa;

public class States {
	String FirstState;
	
	String[] State(String A) {
		String[] States = A.split(",");
		FirstState = States[0];
		return States;
	}
}

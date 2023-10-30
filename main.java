package _20670310030HamzaIdrissa;

public class main extends display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_20670310030_Okuma oku = new _20670310030_Okuma();
		States State = new States();
		Outputs Outer = new Outputs();
		inputs Inter = new inputs();
		display disp = new display();
		oku.okuma();
		
		Divider div = new Divider(oku.durumlar);
		div.divFun();
		// --------- i can put all the dis function in one function and then call them
	
		disp.dip(oku.A);
		disp.dip(State.State(oku.A.get(0)));
		disp.dipNump(Inter.input(oku.A.get(1)));
		disp.dipNump(Outer.Output(oku.A.get(2)));
		disp.dip(div.Outer);
		disp.dip(div.TQ);
		// --------
		System.out.println("first state : " + State.FirstState);
		System.out.println("yeni durum are :");
		// -----------
       div.counqire();
	}

}

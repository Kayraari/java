package quiz2;

public class Main {

	public static void main(String[] args) {
		Foundation[] foundations = new Foundation[4];
		
		foundations[0]= new Formulas1(4,3,5);
		foundations[1]= new Formulas1(-1,5,4);
		foundations[2]= new Formulas2(3,7,4,8);
		foundations[3]= new Formulas2(1,4,9,10);
		
		for(Foundation f: foundations) {
			f.delta();
			f.alpha();
			
			if(f instanceof Formulas1) {
				((Formulas1) f).theta();
				}else if(f instanceof Formulas2) {
					((Formulas2) f).omega(10);
			}
		}
	}
}


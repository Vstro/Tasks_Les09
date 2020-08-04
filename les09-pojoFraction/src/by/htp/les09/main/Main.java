package by.htp.les09.main;

public class Main {

	public static void main(String[] args) {
		Fraction fr1 = new Fraction(1,2);
		Fraction fr2 = new Fraction(3,8);
		
		Fraction fr3;
		
		fr3 = fr1.add(fr2);
		fr3.print();

		fr3.simplify();
		fr3.print();
		
		fr3 = fr3.sub(fr2);
		fr3.print();
		
		fr3 = fr3.div(fr2);
		fr3.print();
		
		fr3 = fr3.multi(fr2);
		fr3.print();
		
		fr3.simplify();
		fr3.print();
	}

}

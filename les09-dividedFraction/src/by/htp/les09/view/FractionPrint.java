package by.htp.les09.view;

import by.htp.les09.entity.Fraction;

public class FractionPrint {
	public void printSimple(Fraction fr) {
		System.out.print(fr.getNum() + "/" + fr.getDen());
	}
	
	
	public void printSimple(Fraction fr, boolean endLine) {		
		System.out.print(fr.getNum() + "/" + fr.getDen());
		
		if(endLine) {
			System.out.println();
		}
	}
	
	public void printDecimal(Fraction fr) {
		System.out.print(1.0 * fr.getNum() / fr.getDen());
	}
	
	public void printDecimal(Fraction fr, boolean endLine) {		
		System.out.print(1.0 * fr.getNum() / fr.getDen());
		
		if(endLine) {
			System.out.println();
		}
	}
}

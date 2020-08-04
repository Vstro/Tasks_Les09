package by.htp.les09.main;

import by.htp.les09.entity.Fraction;
import by.htp.les09.logic.FractionLogic;
import by.htp.les09.view.FractionPrint;

public class Main {

	public static void main(String[] args) {
		Fraction fr1 = new Fraction(1,2);
		Fraction fr2 = new Fraction(5,7);
		
		FractionLogic logic = new FractionLogic();
		FractionPrint print = new FractionPrint();
		
		Fraction fr3 = logic.add(fr1, fr2);
		print.printSimple(fr3, true);
		print.printDecimal(fr3, true);
		
		fr3 = logic.div(fr3, fr2);
		print.printSimple(fr3, true);
		print.printDecimal(fr3, true);
		
		logic.simplify(fr3);
		print.printSimple(fr3, true);
		print.printDecimal(fr3, true);
	}

}

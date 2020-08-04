package by.htp.les09.logic;

import by.htp.les09.entity.Fraction;
import static by.htp.les09.util.FractionUtil.nod;

public class FractionLogic {
	public Fraction add(Fraction fr1, Fraction fr2) {
		Fraction newFraction = new Fraction();
		newFraction.setNum(fr1.getNum() * fr2.getDen() + fr2.getNum() * fr1.getDen());
		newFraction.setDen(fr1.getDen() * fr2.getDen());
		
		return newFraction;
	}
	
	public Fraction sub(Fraction fr1, Fraction fr2) {
		Fraction newFraction = new Fraction();
		newFraction.setNum(fr1.getNum() * fr2.getDen() - fr2.getNum() * fr1.getDen());
		newFraction.setDen(fr1.getDen() * fr2.getDen());
		
		return newFraction;
	}
	
	public Fraction multi(Fraction fr1, Fraction fr2) {
		Fraction newFraction = new Fraction();
		newFraction.setNum(fr1.getNum() * fr2.getNum());
		newFraction.setDen(fr1.getDen() * fr2.getDen());
		
		return newFraction;
	}
	
	public Fraction div(Fraction fr1, Fraction fr2) {
		Fraction newFraction = new Fraction();
		newFraction.setNum(fr1.getNum() * fr2.getDen());
		newFraction.setDen(fr1.getDen() * fr2.getNum());
		
		return newFraction;
	}
	
	public void simplify(Fraction fr) {
		int nod = nod(fr.getNum(), fr.getDen());
		fr.setNum(fr.getNum() / nod);
		fr.setDen(fr.getDen() / nod);
	}
}

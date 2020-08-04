package by.htp.les09.main;

public class Fraction {
	private int num;
	private int den;
	
	public Fraction() {
		this(0, 1);
	}
	
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	public Fraction add(Fraction fr) {
		Fraction newFraction = new Fraction();
		newFraction.num = this.num * fr.den + fr.num * this.den;
		newFraction.den = this.den * fr.den;
		
		return newFraction;
	}
	
	public Fraction sub(Fraction fr) {
		Fraction newFraction = new Fraction();
		newFraction.num = this.num * fr.den - fr.num * this.den;
		newFraction.den = this.den * fr.den;
		
		return newFraction;
	}
	
	public Fraction multi(Fraction fr) {
		Fraction newFraction = new Fraction();
		newFraction.num = this.num * fr.num;
		newFraction.den = this.den * fr.den;
		
		return newFraction;
	}
	
	public Fraction div(Fraction fr) {
		Fraction newFraction = new Fraction();
		newFraction.num = this.num * fr.den;
		newFraction.den = this.den * fr.num;
		
		return newFraction;
	}
	
	public void simplify() {
		int nod = nod(this.num, this.den);
		this.num = this.num / nod;
		this.den = this.den / nod;
	}
	
	private static int nod(int a, int b) {
		while (a != b) {
			while (a > b) {
				a = a - b;
			}
			while (b > a) {
				b = b - a;
			}
		}
		return a;
	}
	
	public void print() {
		System.out.println(this.num + "/" + this.den);
	}
}

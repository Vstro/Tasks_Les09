package by.htp.les09.entity;

import java.io.Serializable;

public class Fraction implements Serializable {
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
		if (den != 0) {
			this.den = den;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + den;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if (den != other.den)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return num + "/" + den;
	}
}

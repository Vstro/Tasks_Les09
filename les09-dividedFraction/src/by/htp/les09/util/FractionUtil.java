package by.htp.les09.util;

public class FractionUtil {
	public static int nod(int a, int b) {
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
}

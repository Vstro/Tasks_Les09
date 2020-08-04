package by.htp.les09.view;

import by.htp.les09.entity.Counter;

public class CounterPrint {
	public void printValue(Counter count) {
		System.out.print("Счётчик: " + count.getValue());
	}
	
	public void printValue(Counter count, boolean endLine) {
		System.out.print("Счётчик: " + count.getValue());
		
		if (endLine) {
			System.out.println();
		}
	}
	
	public void printValueOf(Counter count) {
		System.out.print("Счётчик: " + count.getValue() + " из " + count.getMaxValue());
	}
	
	public void printValueOf(Counter count, boolean endLine) {
		System.out.print("Счётчик: " + count.getValue() + " из " + count.getMaxValue());
		
		if (endLine) {
			System.out.println();
		}
	}
}

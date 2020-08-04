package by.htp.les09.logic;

import by.htp.les09.entity.Counter;

public class CounterLogic {
	public boolean increase(Counter count) {
		if (count.getValue() + 1 > count.getMaxValue()) {
			return false;
		} else {
			count.setValue(count.getValue() + 1);
			return true;
		}
	}
	
	public boolean decrease(Counter count) {
		if (count.getValue() - 1 < count.getMinValue()) {
			return false;
		} else {
			count.setValue(count.getValue() - 1);
			return true;
		}
	}
	
	public int incFor(Counter count, int tics) {
		int actualTics = 0;
		for (; actualTics < tics; actualTics++) {
			if (!increase(count)) {
				break;
			}
		}
		return actualTics;
	}
	
	public int decFor(Counter count, int tics) {
		int actualTics = 0;
		for (; actualTics < tics; actualTics++) {
			if (!decrease(count)) {
				break;
			}
		}
		return actualTics;
	}
}

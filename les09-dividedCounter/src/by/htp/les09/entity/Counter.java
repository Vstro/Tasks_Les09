package by.htp.les09.entity;

import java.io.Serializable;

public class Counter implements Serializable {	
		private int value;
		private int maxValue = 100;
		private int minValue = 0;
		
		public Counter() {
			value = minValue;
		}
		
		public Counter(int value) {
			this.value = value;
		}
		
		public Counter(int minValue, int maxValue, int value) {
			if (maxValue >= minValue) {
				this.minValue = minValue;
				this.maxValue = maxValue;
			}
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public int getMaxValue() {
			return maxValue;
		}

		public void setMaxValue(int maxValue) {
			this.maxValue = maxValue;
		}

		public int getMinValue() {
			return minValue;
		}

		public void setMinValue(int minValue) {
			this.minValue = minValue;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + maxValue;
			result = prime * result + minValue;
			result = prime * result + value;
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
			Counter other = (Counter) obj;
			if (maxValue != other.maxValue)
				return false;
			if (minValue != other.minValue)
				return false;
			if (value != other.value)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return value + " of " + maxValue;
		}
}

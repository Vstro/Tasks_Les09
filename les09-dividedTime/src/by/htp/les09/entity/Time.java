package by.htp.les09.entity;

import java.io.Serializable;

public class Time implements Serializable{
	private int hours;
	private int minutes;
	private int seconds;
	
	public Time() {
		hours = 10;
		minutes = 0;
		seconds = 0;
	}
	
	public Time(int hours, int minutes, int seconds) {
		if (hours < 24 && hours >= 0) {
			this.hours = hours;
		} else {
			hours = 0;
		}
		
		if (minutes < 60 && minutes >= 0) {
			this.minutes = minutes;
		} else {
			minutes = 0;
		}
		
		if (seconds < 60 && seconds >= 0) {
			this.seconds = seconds;
		} else {
			seconds = 0;
		}
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 24 && hours >= 0) {
			this.hours = hours;
		} else {
			hours = 0;
		}
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		if (minutes < 60 && minutes >= 0) {
			this.minutes = minutes;
		} else {
			minutes = 0;
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		if (seconds < 60 && seconds >= 0) {
			this.seconds = seconds;
		} else {
			seconds = 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time: " + hours + ":" + minutes + ":" + seconds;
	}
}

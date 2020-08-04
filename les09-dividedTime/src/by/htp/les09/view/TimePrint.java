package by.htp.les09.view;

import by.htp.les09.entity.Time;

public class TimePrint {
	public void printTime(Time time) {
		System.out.print("Время: ");
		if (time.getHours() < 10) {
			System.out.print("0" + time.getHours() + ":");
		} else {
			System.out.print(time.getHours() + ":");
		}
		
		if (time.getMinutes() < 10) {
			System.out.print("0" + time.getMinutes() + ":");
		} else {
			System.out.print(time.getMinutes() + ":");
		}
		
		if (time.getSeconds() < 10) {
			System.out.print("0" + time.getSeconds());
		} else {
			System.out.print(time.getSeconds());
		}
	}
	
	public void printTime(Time time, boolean endLine) {
		System.out.print("Время: ");
		if (time.getHours() < 10) {
			System.out.print("0" + time.getHours() + ":");
		} else {
			System.out.print(time.getHours() + ":");
		}
		
		if (time.getMinutes() < 10) {
			System.out.print("0" + time.getMinutes() + ":");
		} else {
			System.out.print(time.getMinutes() + ":");
		}
		
		if (time.getSeconds() < 10) {
			System.out.print("0" + time.getSeconds());
		} else {
			System.out.print(time.getSeconds());
		}
		
		if (endLine) {
			System.out.println();
		}
	}
}

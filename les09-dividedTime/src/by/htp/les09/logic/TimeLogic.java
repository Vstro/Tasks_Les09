package by.htp.les09.logic;

import by.htp.les09.entity.Time;

public class TimeLogic {
	public boolean increase(Time time, int extraHours, int extraMinutes, int extraSeconds) {
		if (extraHours >= 0 && extraMinutes >= 0 && extraSeconds >= 0) {
			int carries = 0;
			int seconds = 0;
			int minutes = 0;
			int hours = 0;

			
			seconds = time.getSeconds() + extraSeconds;
			while (seconds > 59) {
				seconds -= 60;
				carries++;
			}
			time.setSeconds(seconds);
			
			minutes = time.getMinutes() + extraMinutes + carries;
			carries = 0;
			while (minutes > 59) {
				minutes -= 60;
				carries++;
			}
			time.setMinutes(minutes);
			
			hours = time.getHours() + extraHours + carries;
			while (hours > 23) {
				hours -= 24;
			}
			time.setHours(hours);
						
			return true;
		}
		return false;
	}
	
	public boolean decrease(Time time, int exHours, int exMinutes, int exSeconds) {
		if (exHours >= 0 && exMinutes >= 0 && exSeconds >= 0) {
			int carries = 0;
			int seconds = 0;
			int minutes = 0;
			int hours = 0;
			
			seconds = time.getSeconds() - exSeconds;
			while (seconds < 0) {
				seconds += 60;
				carries++;
			}
			time.setSeconds(seconds);
			
			minutes = time.getMinutes() - exMinutes - carries;
			carries = 0;
			while (minutes < 0) {
				minutes += 60;
				carries++;
			}
			time.setMinutes(minutes);
			
			hours = time.getHours() - exHours - carries;
			while (hours < 0) {
				hours += 24;
			}
			time.setHours(hours);
						
			return true;
		}
		return false;
	}
}

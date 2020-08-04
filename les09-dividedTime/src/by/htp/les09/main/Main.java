package by.htp.les09.main;

import by.htp.les09.entity.Time;
import by.htp.les09.logic.TimeLogic;
import by.htp.les09.view.TimePrint;

public class Main {

	public static void main(String[] args) {
		Time time = new Time();
		TimeLogic logic = new TimeLogic();
		TimePrint print = new TimePrint();
		
		print.printTime(time, true);
		logic.increase(time, 1, 1, 1);
		print.printTime(time, true);
		
		logic.decrease(time, 1, 1, 1);
		print.printTime(time, true);
		
		logic.increase(time, 14, 10, 1);
		print.printTime(time, true);
		
		logic.decrease(time, 0, 11, 0);
		print.printTime(time, true);
		
		logic.increase(time, 0, 0, 59);
		print.printTime(time, true);
		
		if (logic.increase(time, 0, 0, 3600)) {
			System.out.println("Время успешно переведено вперёд!");
		} else {
			System.out.println("Время не было переведено вперёд! Перевод возможен только на положительную величину!");
		}
		print.printTime(time, true);
		
		if (logic.decrease(time, 0, -120, 0)) {
			System.out.println("Время успешно переведено назад!");
		} else {
			System.out.println("Время не было переведено назад! Перевод возможен только на положительную величину!");
		}
		print.printTime(time, true);
		
		logic.decrease(time, 0, 120, 0);
		print.printTime(time, true);
	}

}

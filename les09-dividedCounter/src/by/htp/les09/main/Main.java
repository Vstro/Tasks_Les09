package by.htp.les09.main;

import by.htp.les09.entity.Counter;
import by.htp.les09.logic.CounterLogic;
import by.htp.les09.view.CounterPrint;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter(1, 10, 5);
		CounterLogic logic = new CounterLogic();
		CounterPrint print = new CounterPrint();
		
		print.printValue(counter, true);

		if (logic.increase(counter)) {
			System.out.println("Cчётчик успешно увеличен!");
		} else {
			System.out.println("Cчётчик не был увеличен!");
		}
		print.printValue(counter, true);
		
		if (logic.decrease(counter)) {
			System.out.println("Cчётчик успешно уменьшен!");
		} else {
			System.out.println("Cчётчик не был уменьшен!");
		}
		print.printValue(counter, true);

		for (int i = 0; i < 5; i++) {
			if (logic.decrease(counter)) {
				System.out.println("Cчётчик успешно уменьшен!");
			} else {
				System.out.println("Cчётчик не был уменьшен!");
			}
			print.printValueOf(counter, true);
		}
		
		System.out.println("Cчётчик увеличен на " + logic.incFor(counter, 20) + "!");
		print.printValue(counter, true);

		System.out.println("Cчётчик уменьшен на " + logic.decFor(counter, 10) + "!");
		print.printValue(counter, true);
	}

}

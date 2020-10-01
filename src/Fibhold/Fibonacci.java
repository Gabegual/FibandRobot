package Fibhold;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public void run() {

		int a = 1;
		int b = 0;
		int sum = a + b;

		println(b);
		println(a);
		println(sum);

		while (sum <10000) {
			b = a;
			a = sum;
			sum = a + b;
			if (sum < 10000) {
			println(sum);
			}
		}
	}
}

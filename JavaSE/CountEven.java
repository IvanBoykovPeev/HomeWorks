package home.work;

import java.util.Scanner;

public class CountEven {

	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a;
		int b = -1;
		do {
			a = input.nextInt();
			if (a%2 == 0) {
				b++;
			}
		} while (a != 0);
		System.out.print(b);
	}
}



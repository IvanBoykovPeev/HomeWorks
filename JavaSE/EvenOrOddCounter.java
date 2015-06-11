package home.work;

import java.util.Scanner;

public class EvenOrOddCounter {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("To quit press 0");
		int countEven = 0;
		while (true) {
			System.out.println("Enter a number.");
			int number = input.nextInt();
			if (number == 0) {
				break;
			}
			if (number % 2 == 0) {
				System.out.println("The number is even: " + number);
				countEven++;
			} else {
				System.out.println("The number is odd: " + number);

			}

		}
		System.out.println("Брой четни: " + countEven);
		System.out.println("End");
	}

}

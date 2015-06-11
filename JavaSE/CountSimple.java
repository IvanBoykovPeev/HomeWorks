package home.work;

import java.util.Scanner;

public class CountSimple {
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
			if (isSimple(number)) {
				countEven++;
			}

		}
		System.out.println("Брой прости: " + countEven);
		System.out.println("End");
	}

	private static boolean isSimple(int number) {
		boolean notPrime = true;
		if (number == 0 || number == 1) {
				notPrime = false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number%i==0) {
				notPrime = false;
			}
		}
		return notPrime;
		
	}

}

package home.work;

import java.util.Scanner;

public class SimpleNumber {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter a positive Number: ");
		boolean prime = true;
		int num = input.nextInt();
		if (num == 2) {
			prime = false;
		}
		int divider = 2;
		int maxDivider = (int) Math.sqrt(num);

		while (prime && (divider <= maxDivider)) {
			if (num % divider == 0) {
				prime = false;
			}
			divider++;
		}
		if (prime) {
			System.out.println("Prime number");
		} if (!prime) {
			System.out.println("Not prime number");
		}

	}
}

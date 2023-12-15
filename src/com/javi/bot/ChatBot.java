package com.javi.bot;
import java.util.Scanner;

public class ChatBot {
	Scanner scanner = new Scanner(System.in);

	private void greeting() {
		System.out.println(
				"Hello! My name is Aid.\r\n" + "I was created in 2023.");
	}

	private void nameBot(Scanner scanner) {

		System.out.println("Please, remind me your name.");

		String name = scanner.nextLine();

		System.out.printf("What a great name you have, %s!", name);
	}

	/*
	 * Simple guessing game that will predict the age of a user.
	 * 
	 * It's based on a simple math trick. First, take a look at this formula:
	 * 
	 * age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
	 */
	
	private void guessAge(Scanner scanner) {
		System.out.println("Let me guess your age.");
		System.out.println(
				"Enter remainders of dividing your age by 3, 5 and 7.");

		int remainder3 = scanner.nextInt();
		int remainder5 = scanner.nextInt();
		int remainder7 = scanner.nextInt();

		int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

		System.out.printf(
				"Your age is %d; that's a good time to start programming!",
				age);

		System.out.println();

		System.out.println(
				"Now I will prove to you that I can count to any number you want.");
	}

	private void count(Scanner scanner) {
		int number = scanner.nextInt();

		for (int i = 0; i <= number; i++) {
			System.out.println(i + "!");
		}

		System.out.println("Completed, have a nice day!");
	}

	private void quizz(Scanner scanner) {
		System.out.println("Why do we use methods?\r\n"
				+ "1. To repeat a statement multiple times.\r\n"
				+ "2. To decompose a program into several small subroutines.\r\n"
				+ "3. To determine the execution time of a program.\r\n"
				+ "4. To interrupt the execution of a program.");

		int response = scanner.nextInt();

		while (response != 2) {
			System.out.println("Please, try again.");
			response = scanner.nextInt();
		}

	}
	private void goodbye() {
		System.out.println("Congratulations, have a nice day!");
	}

	public void run(Scanner scanner) {
		this.greeting();
		this.nameBot(scanner);
		this.guessAge(scanner);
		this.count(scanner);
		this.quizz(scanner);
		this.goodbye();

	}

}

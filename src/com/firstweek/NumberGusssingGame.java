package com.firstweek;

import java.util.Random;
import java.util.Scanner;

public class NumberGusssingGame {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		String play = "yes";

		while (play.equals("yes")) {

			Random random = new Random();
			int randNum = random.nextInt(100);
			int tries = 0;
			int guess = -1;

			System.out.println("Enter the number to guess between 1 to 100");

			while (guess != randNum) {

				guess = reader.nextInt();
				tries++;

				if (guess == randNum) {
					System.out.println("Congratulations! You have guessed the correct answer in " + tries + " tries");
					System.out.println("Would you like to play again, enter yes or no");
					play = reader.next().toLowerCase();

				} else if (guess > randNum) {
					System.out.println("Your guess is too high, Try again!");
				}

				else if (guess < randNum) {
					System.out.println("Your guess is too low, Try again!");
				}
			}

		}
		System.out.println("Game Over!");

	}

}

package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");

		int startPosition = 0;
		int diceCount = 0;

		int noPlay = 0;
		int ladder = 1;
		int snake = 2;
		int maxPosition = 100;
		int minPosition = 0;

		while (startPosition < maxPosition) {

			Random randomNum = new Random();
			int dice = randomNum.nextInt(6) + 1;
			System.out.println("Dice Number:-" + dice);
			diceCount++;

			int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("Random Number:-" + checkPlay);

			switch (checkPlay) {
			case 0:
				break;

			case 1:
				startPosition += dice;
				if (startPosition > maxPosition) {
					startPosition = startPosition - dice;
				}
				break;

			case 2:
				startPosition -= dice;
				if (startPosition < minPosition)
					startPosition = 0;
				break;
			}

			System.out.println("End Position:-" + startPosition);

			System.out.println("Position after Die Roll " + diceCount + " :- " + startPosition);

		}
		System.out.println("Total Dice Rolls : " + diceCount);

	}
}
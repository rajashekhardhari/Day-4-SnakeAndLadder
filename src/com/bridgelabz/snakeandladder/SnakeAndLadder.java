package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	int noPlay = 0;
	int ladder = 1;
	int snake = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");

		int startPosition = 0;
		Random randomNum = new Random();
		int dice = randomNum.nextInt(6) + 1;
		System.out.println("Dice Number:-" + dice);

		int noPlay = 0;
		int ladder = 1;
		int snake = 2;

		int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("Random Number:-" + checkPlay);

		switch (checkPlay) {
		case 0:
			break;

		case 1:
			startPosition += dice;
			break;

		case 2:
			startPosition -= dice;
			break;
		}

		System.out.println("Start Position:-" + startPosition);

	}

}

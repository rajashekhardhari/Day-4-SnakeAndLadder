package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	static int noPlay = 0;
	static int ladder = 1;
	static int snake = 2;
	static int maxPosition = 100;
	static int minPosition = 0;

	public static int positionA = 0;
	public static int positionB = 0;

	public static int playerA() {
		System.out.println("Player A is Rolling Dice");
		Random number = new Random();
		int dice = number.nextInt(6) + 1;
		System.out.println("dice for A : " + dice);

		int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("checkplay for A : " + checkPlay);

		switch (checkPlay) {
		case 0:
			break;

		case 1:
			positionA += dice;
			if (positionA > maxPosition) {
				positionA = positionA - dice;
			}
			if (positionA == maxPosition) {
				System.out.println("Position of A : " + positionA);
				return positionA;
			}
			playerA();
			break;

		case 2:
			positionA -= dice;
			if (positionA < minPosition) {
				positionA = 0;
			}
			break;
		}
		System.out.println("Position of A : " + positionA);
		return positionA;
	}

	public static int playerB() {
		System.out.println("Player B is Rolling Dice");
		Random number = new Random();
		int dice = number.nextInt(6) + 1;
		System.out.println("dice for B : " + dice);

		int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("checkplay for B : " + checkPlay);

		switch (checkPlay) {
		case 0:
			break;

		case 1:
			positionB += dice;
			if (positionB > maxPosition) {
				positionB = positionB - dice;
			}
			if (positionB == maxPosition) {
				System.out.println("Position of B : " + positionB);

				return positionB;
			}
			playerB();
			break;

		case 2:
			positionB -= dice;
			if (positionB < minPosition) {
				positionB = 0;
			}
			break;
		}
		System.out.println("Position of B : " + positionB);
		return positionB;
	}

	public static void main(String[] args) {

		System.out.println("---------- Welcome to the game of SNAKES AND LADDERS!! ----------");

		int positionOfA = 0, positionOfB = 0;
		while (positionOfA < maxPosition || positionOfB < maxPosition) {

			positionOfA = playerA();
			if (positionOfA == maxPosition) {
				System.out.println("Position of A : " + positionOfA);
				System.out.println("Position of B : " + positionOfB);
				System.out.println("--------PLAYER A WON !!-------");
				System.exit(0);
			}

			positionOfB = playerB();
			if (positionOfB == maxPosition) {
				System.out.println("Position of A : " + positionOfA);
				System.out.println("Position of B : " + positionOfB);
				System.out.println("--------PLAYER B WON !!--------");
				System.exit(0);

			}

		}

	}
}
package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Program");

		int startPosition = 0;
		Random randomNum = new Random();
		int dice = randomNum.nextInt(6) + 1;
		System.out.println(dice);

	}

}

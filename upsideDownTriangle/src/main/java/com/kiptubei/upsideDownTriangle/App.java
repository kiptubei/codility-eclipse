package com.kiptubei.upsideDownTriangle;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int number = 5;

		for (int i = 0; i < number; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < number - i; k++) {
				System.out.print("x ");

			}

			System.out.println();
		}
	}
}

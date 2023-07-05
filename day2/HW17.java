package com.java.day2;

import java.util.Random;
import java.util.Scanner;

public class HW17 {
	public static void main(String[] args) {
		Random ran = new Random();
		int answer = ran.nextInt(999) + 1;
		int guess = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap so: ");
			guess = scanner.nextInt();
			if (guess > answer) {
				System.out.println("Smaller");
			}
			if (guess < answer) {
				System.out.println("Bigger");
			}
		} while (guess != answer);
		System.out.println("Correct!	");
		scanner.close();
	}
}

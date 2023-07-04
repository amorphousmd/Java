package com.java.day2;

import java.util.Scanner;

public class HW5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x1: "); float x1 = scanner.nextFloat();
		System.out.print("y1: "); float y1 = scanner.nextFloat();
		System.out.print("x2: "); float x2 = scanner.nextFloat();
		System.out.print("y2: "); float y2 = scanner.nextFloat();
		System.out.println("Do dai AB: " + (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))));
		scanner.close();
	}
}

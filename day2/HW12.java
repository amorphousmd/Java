package com.java.day2;

import java.util.Scanner;

public class HW12 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap so n: ");
			num = scanner.nextInt();
		} while (!(1 <= num && num <= 9));
		scanner.close();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}

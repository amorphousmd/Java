package com.java.day2;

import java.util.Scanner;

public class HW10 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("Nhap so n: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for (int i = 1; i <= num ; i++) {
			sum += i;
		}
		System.out.println("Ket qua: " + sum);
		scanner.close();
	}
}

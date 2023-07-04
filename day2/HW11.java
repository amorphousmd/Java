package com.java.day2;

import java.util.Scanner;

public class HW11 {
	public static void main(String[] args) {
		System.out.print("Nhap so n: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double result = (Math.log(num) / Math.log(2));
		System.out.println("Ket qua: " + ((int)Math.floor(result) - 1));
		scanner.close();
	}
}

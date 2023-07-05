package com.java.day2;

import java.util.Scanner;

public class HW16 {
	public static void main(String[] args) {
		System.out.print("Nhap nam: ");
		Scanner scanner= new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 == 0) {
			System.out.println("Nam nhuan");
		}
		else {
			System.out.println("Khong phai nam nhuan");
		}
		scanner.close();
	}
}

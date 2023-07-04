package com.java.day2;

import java.util.Scanner;

public class HW6 {
	public static void main(String[] args) {
		System.out.print("Nhap chuoi: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		char[] charArray = inputString.toCharArray();
		
		System.out.print("Dao chuoi: ");
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		scanner.close();
	}
}

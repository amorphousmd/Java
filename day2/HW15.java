package com.java.day2;

import java.util.Scanner;

public class HW15 {
	public static void main(String[] args) {
		System.out.println("Nhap chuoi: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		// A
		System.out.print("Do dai cua chuoi: ");
		System.out.println(inputString.length());
		
		// B
		int index = 3;
		charAtIndex(inputString, index);
		
		// C
		if (inputString.contains("abcdef")) {
			System.out.println("Co chuoi phu");
		}
		else {
			System.out.println("Khong co chuoi phu");
		}
		
		scanner.close();
	}
	public static void charAtIndex (String inputString, int index) {
		char[] charArray = inputString.toCharArray();
		System.out.println(charArray[index]);
	}
}

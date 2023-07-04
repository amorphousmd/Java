package com.java.day2;

import java.util.Scanner;

public class HW8 {
	public static void main(String[] args) {
		System.out.print("Nhap chuoi: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		String[] inputArray = inputString.split(" ");
		System.out.print("Chuoi viet hoa: ");
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = Capitalize(inputArray[i]);
			System.out.print(inputArray[i]);
			System.out.print(" ");
		} 
		scanner.close();
	}
	
	public static String Capitalize(String noCap) {
		return (noCap.substring(0, 1).toUpperCase() + noCap.substring(1, noCap.length()));
	}
}

package com.java.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		int decNum = 0;
		int quotient = 0;
		int remainder = 0;
		List<Integer> digitList = new ArrayList<>();
		
		System.out.print("Nhap so thap phan: ");
		Scanner scanner = new Scanner(System.in);
		decNum = scanner.nextInt();
		do {
			quotient = decNum /2;
			remainder = decNum - quotient * 2;
			digitList.add(remainder);
			decNum = quotient;
		} while (quotient != 0);
		
		System.out.print("So nhi phan: ");
		for (int i = digitList.size() - 1; i >= 0; i--) {
			System.out.print(digitList.get(i));
		}
		scanner.close();
	}
}

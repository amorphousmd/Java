package com.java.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		int decNum = 0;
		int quotient = 0;
		int remainder = 0;
		int sum = 0;
		List<Integer> digitList = new ArrayList<>();
		
		System.out.print("Nhap so: ");
		Scanner scanner = new Scanner(System.in);
		decNum = scanner.nextInt();
		do {
			quotient = decNum /10;
			remainder = decNum - quotient * 10;
			digitList.add(remainder);
			decNum = quotient;
		} while (quotient != 0);
		
		for (int i = digitList.size() - 1; i >= 0; i--) {
			sum += digitList.get(i);
		}
		System.out.print("Tong cac chu so: " + sum);
		scanner.close();
	}
}

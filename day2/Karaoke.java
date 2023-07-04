package com.java.day2;

import java.util.Scanner;

public class Karaoke {
	public static void main(String[] args) {
		int startTime = 0;
		int endTime = 0;
		int price = 30000;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Nhap gio vao: ");
			startTime = scanner.nextInt();
			System.out.print("Nhap gio ra: ");
			endTime = scanner.nextInt();
		} while (startTime < 9 || endTime > 24 || startTime >= endTime);
		
		int usageTime = endTime - startTime;
		float priceBeforeSale = 0f;
		float finalPrice = 0;
		
		if (usageTime - 3 > 0) {
			priceBeforeSale = price * 3 + (usageTime - 3) * 30f / 100 * price;
		}
		else {
			priceBeforeSale = usageTime * price;
		}
		finalPrice = priceBeforeSale;
		
		if (9 <= startTime && startTime <= 17) {
			finalPrice = priceBeforeSale * 80/100;
		}
		
		System.out.println("Gia tri hoa don cuoi cung: " + finalPrice);
		scanner.close();
	}
}

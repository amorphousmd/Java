package com.java.day2;

import java.util.Scanner;

public class HW18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so tien gui: ");
		int input = scanner.nextInt();
		System.out.print("Nhap lai suat (%): ");
		float interest = scanner.nextFloat();
		System.out.print("Nhap so tien muon co: ");
		int money = scanner.nextInt();
		System.out.print("So nam can cho la "); 
		System.out.print((int) Math.ceil(Math.log((float)money / input)
										/ Math.log(1 + interest / 100)));
		System.out.println(" nam");
		scanner.close();
	}
}

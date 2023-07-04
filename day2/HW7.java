package com.java.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW7 {
	public static void main(String[] args) {
		int num = 0;
		List<Integer> divisorList = new ArrayList<>();
		
		System.out.println("Nhap vao so");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) {
				divisorList.add(i);
			}
		}
		
		System.out.println("Cac uoc so");
		for (int i = 0; i < divisorList.size(); i++) {
			System.out.print(divisorList.get(i));
			System.out.println(" ");
		}
		
		scanner.close();
	}
}

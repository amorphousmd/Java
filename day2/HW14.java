package com.java.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW14 {
	public static void main(String[] args) {
		System.out.print("So phan tu cua mang: ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] intArray = new int[length];
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("Nhap phan tu thu " + (i+1) + " : ");
			intArray[i] = scanner.nextInt();
		}
		List<Integer> uniqueList = new ArrayList<>();
		for (int i = 0; i < intArray.length; i++) {
			if (!isIn(uniqueList, intArray[i])) {
				uniqueList.add(intArray[i]);
			}
		}
		System.out.println("Cac phan tu duy nhat: ");
		for (int i = 0; i < uniqueList.size(); i++) {
			System.out.print(uniqueList.get(i) + " ");
		}
		scanner.close();
	}
	
	public static boolean isIn (List<Integer> arr, int element) {
		for (int i = 0; i < arr.size(); i++) {
			if (element == arr.get(i)) {
				return true;
			}
		}
		return false;
	}
}

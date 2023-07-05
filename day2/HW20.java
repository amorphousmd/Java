package com.java.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW20 {
	public static void main(String[] args) {
		System.out.print("So phan tu cua mang: ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] intArray = new int[length];
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("Nhap phan tu thu " + (i+1) + " : ");
			intArray[i] = scanner.nextInt();
		}
		scanner.close();
		int[][] array = evenOddArray(intArray);
		int[] evenArray = array[0];
		int[] oddArray = array[1];
		System.out.println("Cac phan tu mang chan: ");
		for (int i = 0; i < evenArray.length; i++) {
			System.out.print(evenArray[i] + " ");
		}
		System.out.println("");
		System.out.println("Cac phan tu mang le: ");
		for (int i = 0; i < oddArray.length; i++) {
			System.out.print(oddArray[i] + " ");
		}
	}
	
	public static int[][] evenOddArray(int[] arr) {
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			}
			else {
				oddList.add(arr[i]);
			}
		}
		int[] evenArray = new int[evenList.size()];
		for (int i = 0; i < evenList.size(); i++) {
			evenArray[i] = evenList.get(i);
		}
		
		int[] oddArray = new int[oddList.size()];
		for (int i = 0; i < oddList.size(); i++) {
			oddArray[i] = oddList.get(i);
		}
		
		int evenOddArray[][] = new int[2][];
		evenOddArray[0] = evenArray;
		evenOddArray[1] = oddArray;
		
		return evenOddArray;
		
	}
}

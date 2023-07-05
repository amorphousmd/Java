package com.java.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW13 {
	public static void main(String[] args) {
		System.out.print("So phan tu cua mang: ");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] intArray = new int[length];
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("Nhap phan tu thu " + (i+1) + " : ");
			intArray[i] = scanner.nextInt();
		}
		// A
		System.out.println("");
		averageCalc(intArray);
		
		// B
		System.out.println("");
		System.out.println("Max: " + findMax(intArray));
		System.out.println("Min: " + findMin(intArray));
		scanner.close();
		
		// C
		System.out.println("");
		if (getNeg(intArray).length == 0) {
			System.out.println("Khong co phan tu am");
		}
		else {
			System.out.println("Max Neg: " + findMax(getNeg(intArray)));
			System.out.println("Min Neg: " + findMin(getNeg(intArray)));
		}
		
		// D
		System.out.println("");
		System.out.println("");
		if (getPos(intArray).length == 0) {
			System.out.println("Khong co phan tu duong");
		}
		else {
			System.out.println("Max Pos: " + findMax(getPos(intArray)));
			System.out.println("Min Pos: " + findMin(getPos(intArray)));
		}
		
		// E
		System.out.println("");
		printEvenOdd(intArray);
		
		// F
		System.out.println("");
		System.out.println("Insertion");
		int index = 2;
		int value = 3;
		int[] newArray = insertAtIndex(intArray, index, value);
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		// G
		System.out.println("");
		System.out.println("Deletion");
		int[] newArray2 = deleteAtIndex(intArray, index);
		for (int i = 0; i < newArray2.length; i++) {
			System.out.print(newArray2[i] + " ");
		}
	}
	
	public static void averageCalc(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Trung binh mang: " + ((float)sum / arr.length));
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int[] getPos(int[] arr) {
		List<Integer> posList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				posList.add(arr[i]);
			}
		}
		int[] intArr = new int[posList.size()];
		for (int i = 0; i < posList.size(); i++) {
			intArr[i] = posList.get(i);
		}
		return intArr;
	}
	
	public static int[] getNeg(int[] arr) {
		List<Integer> negList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negList.add(arr[i]);
			}
		}
		int[] intArr = new int[negList.size()];
		for (int i = 0; i < negList.size(); i++) {
			intArr[i] = negList.get(i);
		}
		return intArr;
	}
	
	public static int[] insertAtIndex(int[] arr, int index, int value) {
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arrayList.add(arr[i]);
		}
		arrayList.add(index, value);
		int[] intArr = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			intArr[i] = arrayList.get(i);
		}
		return intArr;
	}
	
	public static int[] deleteAtIndex(int[] arr, int index) {
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arrayList.add(arr[i]);
		}
		arrayList.remove(index);
		int[] intArr = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			intArr[i] = arrayList.get(i);
		}
		return intArr;
	}
	
	public static void printEvenOdd(int[] arr) {
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
		System.out.print("Cac phan tu chan: ");
		for (int i = 0; i < evenList.size(); i++) {
			System.out.print(evenList.get(i) + " ");
		}
		
		System.out.println(" ");
		System.out.print("Cac phan tu le: ");
		for (int i = 0; i < oddList.size(); i++) {
			System.out.print(oddList.get(i) + " ");
		}
		
	}
}

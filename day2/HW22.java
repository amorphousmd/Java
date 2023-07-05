package com.java.day2;

import java.util.Scanner;

public class HW22 {
	public static void main(String[] args) {
		System.out.println("Nhap chuoi: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		scanner.close();
		char[] charArray = inputString.toCharArray();
		
		// Even
		int highE = 0, lowE = 0;
		int ptrStartE = 0;
		int ptrEndE = 0;
		int maxLengthE = -1;
		for (int i = 0; i < inputString.length(); i++) {
			// Even size
			lowE = i;
			highE = i + 1;
			while (lowE >= 0 && highE <= inputString.length() - 1 
					&& charArray[lowE] == charArray[highE]) {
				lowE--;
				highE++;
				if (highE - lowE - 2 > maxLengthE) {
					maxLengthE = highE - lowE - 2;
					ptrStartE = lowE + 1;
					ptrEndE = highE - 1;
				}
			}
		}
		System.out.println(inputString.substring((ptrStartE + ptrEndE) / 2 + 1, ptrEndE + 1));
		// Odd size
		
		int highO = 0, lowO = 0;
		int ptrStartO = 0;
		int ptrEndO = 0;
		int maxLengthO = -1;
		for (int i = 0; i < inputString.length(); i++) {
			// Even size
			lowO = i - 1;
			highO = i + 1;
			while (lowO >= 0 && highO <= inputString.length() - 1 
					&& charArray[lowO] == charArray[highO]) {
				lowO--;
				highO++;
				if (highO - lowO - 2 > maxLengthO) {
					maxLengthE = highO - lowO - 2;
					ptrStartO = lowO + 1;
					ptrEndO = highO - 1;
				}
			}
		}
		System.out.println(inputString.substring((ptrStartO + ptrEndO) / 2 + 1, ptrEndO + 1));
	}
}

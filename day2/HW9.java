package com.java.day2;

import java.util.Scanner;

public class HW9 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Nhap so thu nhat: ");
			num1 = scanner.nextInt();
			System.out.print("Nhap so thu hai: ");
			num2 = scanner.nextInt();
		} while (!((10 <= num1 && num1 <= 99) && (10 <= num2 && num2 <= 99)));
		
		int chuc1 = num1 / 10;
		int donVi1= num1 - 10 * chuc1;
		int chuc2 = num2 / 10;
		int donVi2= num2 - 10 * chuc2;
		
		if(chuc1 == chuc2) {
			System.out.println("TRUE");
			scanner.close();
			return;
		}
		else if (chuc1 == donVi2) {
			System.out.println("TRUE");
			scanner.close();
			return;
		}
		else if (donVi1 == donVi2) {
			System.out.println("TRUE");
			scanner.close();
			return;
		}
		else if (donVi1 == donVi2) {
			System.out.println("TRUE");
			scanner.close();
			return;
		}
		else {
			System.out.println("FALSE");
			scanner.close();
			return;
		}
	}
}

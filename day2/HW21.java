package com.java.day2;

import java.util.Scanner;

public class HW21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int x1, x2, v1, v2;

        do {
            System.out.println("Nhap x1: ");
            x1 = scanner.nextInt();
            
            System.out.println("Nhap x2: ");
            x2 = scanner.nextInt();
        } while (!(x1 >= 0 && x1 < x2 && x2 < 10000));
        
        do {
            System.out.println("Nhap v1: ");
            v1 = scanner.nextInt();
            
            System.out.println("Nhap v2: ");
            v2 = scanner.nextInt();
        } while (!(v1 >= 1 && v1 <= 10000 && v2 >= 1 && v2 <= 10000));
        
        double t  = ((double)x2 - (double)x1) / (v1 - v2);
        if (t < 0 || (v1 == v2)) {
			System.out.println("Khong the gap nhau");
		}
        else {
			System.out.println("gap nhau sau t = " + t);
		}
        scanner.close();
	}
}

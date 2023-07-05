package com.java.day2;

import java.util.Scanner;

public class HW19 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the type of polynomial:");
        System.out.println("1. 1st Order Polynomial");
        System.out.println("2. 2nd Order Polynomial");
        int polynomialType = scanner.nextInt();
        
        if (polynomialType == 1) {
        	System.out.println("First Order Solving");
        	System.out.println("ax + b = 0");
            System.out.println("a? : ");
            
            int a = scanner.nextInt();
            
            System.out.println("b? : ");
            int b = scanner.nextInt();
            
            solveFirstOrder(a, b);
            
        } else if (polynomialType == 2) {
        	System.out.println("Second order solving");
        	System.out.println("ax^2 + bx + c");
        	
            System.out.println("a? : ");
            int a = scanner.nextInt();
            
            System.out.println("b? : ");
            int b = scanner.nextInt();
            
            System.out.println("c? : ");
            int c = scanner.nextInt();
            
            solveSecondOrder(a, b, c);
        } else {
            System.out.println("Invalid Input");
        }
        
        scanner.close();
    }
    
    public static void solveFirstOrder(int a, int b) {
        if (a == 0) {
            System.out.println("Not first order");
        } else {
            System.out.println("Root: " + -(double)b/a);
        }
    }
    
    public static void solveSecondOrder(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Not second order");
        } else {
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("2 roots: " + root1 + ", " + root2);
            } else if (delta == 0) {
                double root = -b / (2 * a);
                System.out.println("Root: " + root);
            } else {
                System.out.println("No real roots");
            }
        }
    }
}

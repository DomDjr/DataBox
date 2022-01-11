package javaCode;

import java.util.Scanner;

public class Calculator {
	public static void main (String [] args) {
		double firstNumber, secondNumber;
		String endCalculator;
		boolean calculateMore = true;
		int chooseCalculation;
		double finalCalculation = 0;
		System.out.println("+----------------------+");
		System.out.println("Calculator (Version 1.0)");
		System.out.println("+----------------------+");
		Scanner userInput = new Scanner(System.in);
		do {
			System.out.println("first number?");
			firstNumber = userInput.nextDouble();
			System.out.println("second number?");
			secondNumber = userInput.nextDouble();
			System.out.println("----------" + "\n" + "1) Addition" + "\n" + "2) Subtraction" + "\n" + "3) Multiplication" + "\n" + "4) Division" + "\n" + "-----------");
			chooseCalculation = userInput.nextInt();
			
			if (chooseCalculation == 1) {
				finalCalculation = computeAddition(firstNumber,secondNumber);
			}
			else if (chooseCalculation == 2) {
				finalCalculation = computeSubtraction(firstNumber,secondNumber);
			}
			else if (chooseCalculation == 3) {
				finalCalculation = computeMultiplication(firstNumber,secondNumber);
			}
			else if (chooseCalculation == 4) {
				finalCalculation = computeDivision(firstNumber,secondNumber);
			}
			else {
				System.out.println("Error WRONG input.");
				System.exit(0);
			}
			System.out.println("The result after the computation is " + finalCalculation);
			System.out.println("Would you like to continue? (Y/N)");
			endCalculator = userInput.next();
			
			if (endCalculator.equals("Y")) {
				calculateMore = true;
			}
			else {
				calculateMore = false;
			}
				
		}while (calculateMore != false);
	System.out.println("Thank you for using the calculator!");
	}
	
	public static double computeAddition (double first, double second) {
		double finalCalculation = first + second;
		return finalCalculation;
	}
	public static double computeSubtraction(double first, double second) {
		double finalCalculation = first - second;
		return finalCalculation;
	}
	public static double computeMultiplication(double first, double second) {
		double finalCalculation = first * second;
		return finalCalculation;
	}
	public static double computeDivision(double first, double second) {
		double finalCalculation = first / second;
		return finalCalculation;
	}












}

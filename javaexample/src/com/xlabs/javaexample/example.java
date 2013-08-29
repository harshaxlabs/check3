package com.xlabs.javaexample;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter two number whose GCD needs to be calculated.     
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first number to find GCD");
		int number1 = scanner.nextInt();
		System.out.println("Please enter second number to find GCD");
		int number2 = scanner.nextInt();

		System.out.println("GCD of two numbers " + number1 +" and " 
				+ number2 +" is :" + findGCD(number1,number2));
		scanner.close();
	}

	private static int findGCD(int number1, int number2) {
		//base case
		if(number2 == 0){
			return number1;
		}
		return findGCD(number2, number1%number2);
	}

}

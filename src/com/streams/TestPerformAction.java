package com.streams;

import java.util.Scanner;

public class TestPerformAction {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		PerformAction performAct = new PerformAction();
		
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		//Tests the number whether it is odd and returns a boolean value
		if(performAct.performOperationIsOdd().test(number))
			System.out.println("The number entered is odd");
		else
			System.out.println("Number is not odd");
		
		//Tests the number whether it is prime and returns a boolean value
		if(performAct.performOperationIsPrime().test(number))
			System.out.println("The number entered is prime");
		else
			System.out.println("Number is not prime");
		
		//Tests the number whether it is Palindrome and returns a boolean value
		if(performAct.performOperationIsPalindrome().test(number))
			System.out.println("The number entered is palindrome");
		else
			System.out.println("Number is not palindrome");
		
	}
	
}

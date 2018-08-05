package com.streams;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PerformAction {

	//Uses the odd number logic and returns the boolean value
	public Predicate<Integer> performOperationIsOdd(){
		Predicate<Integer> isOdd = n -> n % 2 != 0;
		return isOdd;
	}
	
	//Uses the prime number logic and returns the boolean value
	public Predicate<Integer> performOperationIsPrime(){
		Predicate<Integer> isPrime = n -> n > 1 && IntStream.range(2, n-1).noneMatch(i -> n%i == 0);
		return isPrime;
	}
	
	//Uses the Palindrome logic and returns the boolean value
	public Predicate<Integer> performOperationIsPalindrome(){
		Predicate<Integer> isPalindrome = n -> Integer.toString(n).equals(new StringBuilder(Integer.toString(n)).reverse().toString());
		return isPalindrome;
	}
	
}

package com.scm.practice;

public class SquaresOfFirst10OddNum {

	public static void main(String[] args) {
		int a;
		
		for(a=0; a<10; a++) {
			int oddNumber = 2*a+1;
			int squareOfOddNumber = oddNumber*oddNumber;
			System.out.println(squareOfOddNumber);
		}
	}

}

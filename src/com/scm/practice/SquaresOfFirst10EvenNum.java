package com.scm.practice;

public class SquaresOfFirst10EvenNum {

	public static void main(String[] args) {
		int b;
		
		for (b=0; b<10; b++) {
			int evenNumber = b*2;
			int squareOfEvenNumber = evenNumber*evenNumber;
			System.out.println(squareOfEvenNumber);
		}
		
	}
}



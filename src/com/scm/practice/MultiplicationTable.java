package com.scm.practice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int a = 1;
		int b;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number to get Multiplication Table");
			b=scan.nextInt();
			
			for(a=1; a<=10 ;a++) {
				System.out.printf("%d x %d = %d\n",b,a,a*b);
			}
		}

	}

}

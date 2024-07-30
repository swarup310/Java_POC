package com.scm.practice;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		int a;
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of A:");
			a=sc.nextInt();
			
			if(a%2==0) {
				System.out.printf("%d is an Even Number",a).println();
				break;
			}
			else {
				System.out.printf("%d is not an Even Number",a).println();
			}
		}

	}

}

package com.scm.practice;

import java.util.Scanner;

public class Add_and_Compare {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a..");
		a=sc.nextInt();
		System.out.println("Enter the value of b..");
		b=sc.nextInt();
		System.out.println("Enter the value of c..");
		c=sc.nextInt();
		System.out.println("Enter the value of d..");
		d=sc.nextInt();
		
		  if (a+b>c+d) {
		  System.out.printf("%d is greater than %d",a+b,c+d).println();
		  break;
		  }
		  else {
	
			  System.out.printf("%d is less than %d\n\nPlease re-enter value:",a+b,c+d).println(); 
			 
		  }
		}

	}

}

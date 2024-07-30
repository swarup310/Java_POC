package com.scm.practice;

import java.util.Scanner;

public class AnglesCalculatedForTriangle {
	
	public static void main(String[] args) {
		int angle1;
		int angle2;
		int angle3;
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Angle 1 value..");
		angle1=sc.nextInt();
		System.out.println("Enter Angle 2 value..");
		angle2=sc.nextInt();
		System.out.println("Enter Angle 3 value..");
		angle3=sc.nextInt();
		
		if(angle1+angle2+angle3==180) {
			System.out.println("Triangle can be created using the provided angles");
			break;
		}
		else {
			System.out.println("Triangle cannot be created using the provided angles");
		}
		}
	}
}

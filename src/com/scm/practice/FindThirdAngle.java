package com.scm.practice;

import java.util.Scanner;

public class FindThirdAngle {
    public static void main(String[] args){
        FindThirdAngle calculate = new FindThirdAngle();
        calculate.thirdAngle();
    }
    public static void thirdAngle(){
        int a;
        int b = 78;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Angle..");
        a=sc.nextInt();
        System.out.println("Enter Second Angle..");
        b=sc.nextInt();
        System.out.printf("First Angle is %d, Second Angle is %d. So Third Angle will be %d",a,b,180-(a+b)).println();
    }
}

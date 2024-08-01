package com.scm.practice;

public class MethodSquaresOfNumbers {
    public static void main(String[] args) {
        MethodSquaresOfNumbers square = new MethodSquaresOfNumbers();
        square.printNumbers(10); //This is print the num from 1 to 10
    }

    //Method to print the square of num from 1 to n
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i*i);
        }
    }
}
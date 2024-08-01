package com.scm.practice;

import java.util.Scanner;

public class MethodMultiplicationTable {
    public static void main(String[] args) {
        MethodMultiplicationTable multi = new MethodMultiplicationTable();
        multi.multiplicationTable();
    }
    public static void multiplicationTable() {
            int table;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number for multiplication table = ");
            table = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d", table, i, table * i).println();
            }
        }
    }

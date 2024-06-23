package org.example.backjoon.Conditional_Statements;

import java.util.Scanner;
// 윤년
public class bj_2753 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int year = Scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

package org.example.backjoon.Conditional_Statements;

import java.util.Scanner;
//두 수 비교하기
public class bj_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }
    }
}

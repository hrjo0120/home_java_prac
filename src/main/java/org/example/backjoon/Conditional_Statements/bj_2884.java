package org.example.backjoon.Conditional_Statements;

import java.util.Scanner;

public class bj_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (H == 0 && M < 45) {
            System.out.println(23 + " " + (M + 15));
        } else if (M < 45) {
            System.out.println((H - 1) + " " + (M + 15));
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}

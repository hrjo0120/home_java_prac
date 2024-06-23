package org.example.backjoon.inputoutput;

import java.util.Scanner;
// 미완료 - (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
public class bj_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력
        int a = scanner.nextInt();      //정수
        String[] b = scanner.nextLine().split("");  //배열로 입력받아서 ""로 자르기 //3자리라서 012들어감

        System.out.println(a);
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        //출력
    }
}

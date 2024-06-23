package org.example.prac_34;
// 문제 - n부터 m까지의 합을 반환하는 함수
// 문제 : 아래와 같이 출력 되도록 해주세요.

public class prac_34_4 {
    public static void main(String[] args) {
        int 결과1 = Math.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math {
    static int nToMSum(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        return sum;
    }
}

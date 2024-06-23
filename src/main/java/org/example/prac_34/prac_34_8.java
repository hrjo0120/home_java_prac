package org.example.prac_34;
// 문제 - 5개의 서로 다른 종류의 객체를 만들고 각각의 객체에게 일을 시켜주세요.
// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.
public class prac_34_8 {
    public static void main(String[] args) {
        class1 class1_1 = new class1();
        class1_1.method1();

        class2 class2_1 = new class2();
        class2_1.method2();

        class3 class3_1 = new class3();
        class3_1.method3();

        class4 class4_1 = new class4();
        class4_1.method4();

        class5 class5_1 = new class5();
        class5_1.method5();
    }
}

class class1 {
    void method1() {
        System.out.println("method1");
    }
}

class class2{
    void method2() {
        System.out.println("method2");
    }
}

class class3 {
    void method3() {
        System.out.println("method3");
    }
}

class class4 {
    void method4() {
        System.out.println("method4");
    }
}

class class5 {
    void method5() {
        System.out.println("method5");
    }
}
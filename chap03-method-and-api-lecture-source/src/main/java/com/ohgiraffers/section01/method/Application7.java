package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {

        /* 매개변수와 리턴값 복합 활용 */

        int firstA = 20;
        int secondB = 10;

        Application7 app7 = new Application7();
        System.out.println("더하기 : " + app7.plusTwoNumbers(firstA, secondB));
        System.out.println("빼기 : " + app7.minusTwoNumbers(firstA, secondB));
        System.out.println("곱하기 : " + app7.multipleTwoNumbers(firstA, secondB));
        System.out.println("나누기 : " + app7.divideTwoNumbers(firstA, secondB));

    }
    public int plusTwoNumbers(int first, int second){

        return first + second;
    }

    public int minusTwoNumbers(int first, int second){

        return first - second;
    }

    public int multipleTwoNumbers(int first , int second){

        return first * second;

    }

    public int divideTwoNumbers(int first , int second){

        return first / second;
    }
}
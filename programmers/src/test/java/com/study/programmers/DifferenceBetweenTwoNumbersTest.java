package com.study.programmers;

import org.junit.jupiter.api.Test;

public class DifferenceBetweenTwoNumbersTest {

    DifferenceBetweenTwoNumbers differenceBetweenTwoNumbers = new DifferenceBetweenTwoNumbers();

    @Test
    void test01() {

        int num1 = 2;
        int num2 = 3;

        int subtraction = differenceBetweenTwoNumbers.solution(num1, num2);
        System.out.println(String.format("num1이 %d 이고 num2가 %d 이므로 %d - %d = %d 를 return 합니다.", num1, num2, num1, num2, subtraction ));
    }

    @Test
    void test02() {

        int num1 = 100;
        int num2 = 2;

        int subtraction = differenceBetweenTwoNumbers.solution(num1, num2);
        System.out.println(String.format("num1이 %d 이고 num2가 %d 이므로 %d - %d = %d 를 return 합니다.", num1, num2, num1, num2, subtraction ));
    }
}

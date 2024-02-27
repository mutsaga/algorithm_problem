package com.study.programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOfDuplicatesTest {

    NumberOfDuplicates numberOfDuplicates = new NumberOfDuplicates();

    @Test
    void test01() {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;

        int count = numberOfDuplicates.solution(array, n);
        System.out.println(String.format("%s 에는  %d이  %d개 있습니다.", Arrays.toString(array), n, count));
    }

    @Test
    void test02() {
        int[] array = {0, 2, 3, 4};
        int n = 1;

        int count = numberOfDuplicates.solution(array, n);
        System.out.println(String.format("%s 에는  %d이  %d개 있습니다.", Arrays.toString(array), n, count));
    }
}

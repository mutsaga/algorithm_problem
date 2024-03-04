package com.study.programmers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PeopleTallerThanHeadHeightTest {

    PeopleTallerThanHeadHeight peopleTallerThanHeadHeight = new PeopleTallerThanHeadHeight();

    @Test
    void test01() {
        int[] array = {149, 180, 192, 170};
        int n = 167;

        int count = peopleTallerThanHeadHeight.solution(array, n);
        System.out.println(String.format("%s 중 %d인 머쓱이보다 키가 큰 사람은 %d명 있습니다.", Arrays.toString(array), n, count));
    }

    @Test
    void test02() {
        int[] array = {180, 120, 140};
        int n = 190;

        int count = peopleTallerThanHeadHeight.solution(array, n);
        System.out.println(String.format("%s 중 %d인 머쓱이보다 키가 큰 사람은 %d명 있습니다.", Arrays.toString(array), n, count));
    }
}

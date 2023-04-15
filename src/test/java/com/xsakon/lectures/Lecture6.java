package com.xsakon.lectures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Predicate;

public class Lecture6 {

    final Predicate<Integer> numbersLessThan6 = num -> num < 6;

    @Test
    public void findAny() throws Exception{
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int any = Arrays.stream(numbers)
                .filter(numbersLessThan6)
                .findAny()
                .get();

        System.out.println(any);
    }

    @Test
    public void findFirst() throws Exception{
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int first = Arrays.stream(numbers)
                .filter(numbersLessThan6)
                .findFirst()
                .get();

        System.out.println(first);
    }
}

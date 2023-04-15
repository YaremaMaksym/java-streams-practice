package com.xsakon.lectures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lecture9 {

    @Test
    public void sumUsingReduce() throws Exception {
        Integer[] integers = {1, 2, 3, 4, 99, 100, 122, 1412};


        Integer sum = Arrays.stream(integers).reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }

    @Test
    public void factorial() throws Exception {
        int num = 4;

        int factorial = IntStream.rangeClosed(1, num)
                .reduce(1, (a, b) -> a * b);
        System.out.println(factorial);
    }

    @Test
    public void longestWord() throws Exception {
        String sentence = "The quick brown fox jumps over the lazy dog";

        String longestWord = Stream.of(sentence.split(" ")).reduce("", (w1, w2) -> w1.length() > w2.length() ? w1 : w2);

        System.out.println(longestWord);
    }
}

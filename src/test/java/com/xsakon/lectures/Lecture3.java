package com.xsakon.lectures;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Lecture3 {

    @Test
    public void min() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 25, 95, 98);

        Integer min = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        assertThat(min).isEqualTo(1);
        System.out.println(min);

    }

    @Test
    public void max() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 25, 95, 98);

        Integer max = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        assertThat(max).isEqualTo(100);
        System.out.println(max);
    }
}

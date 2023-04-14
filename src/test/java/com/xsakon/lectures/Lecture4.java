package com.xsakon.lectures;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Lecture4 {

    @Test
    public void distinct() throws Exception{
        final List<Integer> numbers = ImmutableList.of(1,2,3,7,3,4,4,5,5,6,6,1,7,8,8,9,2,9);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        assertThat(distinctNumbers).hasSize(9);
        System.out.println(distinctNumbers);

    }


    @Test
    public void distinctWithSet() throws Exception{
        final List<Integer> numbers = ImmutableList.of(1,2,3,7,3,4,4,5,5,6,6,1,7,8,8,9,2,9);

        Set<Integer> distinctNumbers = numbers.stream()
                .collect(Collectors.toSet());

        assertThat(distinctNumbers).hasSize(9);
        System.out.println(distinctNumbers);
    }
}

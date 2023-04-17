package com.xsakon.lectures;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture10 {

    private static final List<List<String>> arrayListOfNames = List.of(
            List.of("Mariam", "Alex", "Ismail"),
            List.of("John", "Alesha", "Andre"),
            List.of("Susy", "Ali")
    );

    @BeforeEach
    void setUp() {
        System.out.println(arrayListOfNames);
    }


    @Test
    public void withoutFlatMap() throws Exception {
        List<String> names = Lists.newArrayList();

        /*for (int i = 0; i < arrayListOfNames.size(); i++) {
            for (int j = 0; j < arrayListOfNames.get(i).size(); j++) {
                names.add(arrayListOfNames.get(i).get(j));
            }
        }*/

        for (List<String> arrayList : arrayListOfNames) {
            for (String name : arrayList) {
                names.add(name);
            }
        }

        System.out.println(names);
    }

    @Test
    public void withFlatMap() throws Exception {
        List<String> names = arrayListOfNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
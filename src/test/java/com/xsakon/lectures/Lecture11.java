package com.xsakon.lectures;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture11 {

    @Test
    public void joiningStrings() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
        // "Anna, John, Marcos, Helena, Yasmin"

        String namesInString = "";

        for (String name : names) {
            namesInString += name + ", ";
        }

        System.out.println(namesInString.substring(0, namesInString.length()-2));
    }
    @Test
    public void joiningStringsWithStream() throws Exception {
        List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");

        String namesInString = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("|"));

        System.out.println(namesInString);

    }

}

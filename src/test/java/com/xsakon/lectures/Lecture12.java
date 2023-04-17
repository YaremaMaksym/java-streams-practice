package com.xsakon.lectures;

import com.xsakon.beans.Person;
import com.xsakon.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture12 {

    @Test
    public void understandingCollect() throws Exception{

//        List<String> emails = MockData.getPeople()
//                .stream()
//                .map(Person::getEmail)
//                .collect(Collectors.toList());

//        List<String> emails = MockData.getPeople()
//                .stream()
//                .map(Person::getEmail)
//                .collect(
//                        () -> new ArrayList<String>(),
//                        (list, element) -> list.add(element),
//                        (list1, list2) -> list1.addAll(list2));


        List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);


        emails.forEach(System.out::println);

    }
}

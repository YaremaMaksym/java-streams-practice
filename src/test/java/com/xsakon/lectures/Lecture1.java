package com.xsakon.lectures;

import com.xsakon.beans.Person;
import com.xsakon.mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture1 {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();

        List<Person> youngPeople = Lists.newArrayList();
        List<Person> firstPeople = Lists.newArrayList();

        /*for (int i = 0; i < people.size(); i++){
            if (people.get(i).getAge() <= 18){
                youngPeople.add(people.get(i));
            }
        }


        for (int i = 0; i < 10; i++){
            firstPeople.add(people.get(i));
        }*/

        final int limit = 10;
        int counter = 0;

        for (Person person: people) {
            if (person.getAge() <= 18){
                youngPeople.add(person);
                System.out.println(person.getAge());
                counter++;
                if (counter == limit){
                    break;
                }
            }
        }


    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception{
        List<Person> people = MockData.getPeople();

        List<Person> youngPeople = people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());

        youngPeople.forEach(System.out::println);
    }
}

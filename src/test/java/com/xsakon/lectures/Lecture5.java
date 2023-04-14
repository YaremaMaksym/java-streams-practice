package com.xsakon.lectures;

import com.google.common.collect.ImmutableList;
import com.xsakon.beans.Car;
import com.xsakon.beans.CarDTO;
import com.xsakon.beans.Person;
import com.xsakon.beans.PersonDTO;
import com.xsakon.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Lecture5 {

    @Test
    public void understandingFilter() throws Exception {
        List<Car> cars = MockData.getCars();

        final Predicate<Car> carPredicate = car -> car.getPrice() < 20000;

        List<Car> carsFiltered = cars.stream()
                .filter(carPredicate)
                .collect(Collectors.toList());

        carsFiltered.forEach(System.out::println);
    }

    @Test
    public void ourFirstMapping() throws Exception {
        // transfer from one data type to another
        List<Person> people = MockData.getPeople();

        List<PersonDTO> dtos = people.stream()
                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge()))
                .collect(Collectors.toList());

        assertThat(dtos).hasSize(1000);
        dtos.forEach(System.out::println);
    }

    @Test
    public void carMapping() throws Exception {
        List<Car> cars = MockData.getCars();

        List<CarDTO> dtos = cars.stream()
                .map(CarDTO::map)
                .collect(Collectors.toList());

        assertThat(dtos).hasSize(1000);
        dtos.forEach(System.out::println);
    }


    @Test
    public void averageCarPrice() throws Exception {
        List<Car> cars = MockData.getCars();

        double average = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        System.out.println(average);
    }
}

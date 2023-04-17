package com.xsakon.lectures;

import com.xsakon.beans.Car;
import com.xsakon.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture13 {

    @Test
    public void intermediateAndTerminalOperations() throws Exception {

        List<Car> cars = MockData.getCars();

        List<Double> filteredCars = cars.stream()
                .filter(car -> {
                    System.out.println("Filter price of car");
                    return car.getPrice() < 10000;
                })
                .map(car -> {
                    System.out.println("Mapping car");
                    return car.getPrice();
                })
                .map(price -> {
                    System.out.println("Mapping price of car");
                    return price + (price * .14);
                })
                .collect(Collectors.toList());

        System.out.println(filteredCars);

    }
}

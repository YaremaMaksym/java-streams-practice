package com.xsakon.lectures;

import com.xsakon.beans.Car;
import com.xsakon.beans.CarDTO;
import com.xsakon.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Lecture7 {

    @Test
    public void count() throws Exception {
        long count = MockData.getPeople().stream()
                .filter(person -> person.getGender().equalsIgnoreCase("Female"))
                .count();

        System.out.println(count);
    }

    @Test
    public void min() throws Exception {
        List<Car> cars = MockData.getCars();

        double min = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("Yellow"))
                .mapToDouble(Car::getPrice)
                .min()
                .getAsDouble();

        System.out.println(min);

    }

    @Test
    public void max() throws Exception {
        List<Car> cars = MockData.getCars();

        double max = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("Yellow"))
                .mapToDouble(Car::getPrice)
                .max()
                .getAsDouble();

        System.out.println(max);
    }

    @Test
    public void average() throws Exception{
        List<Car> cars = MockData.getCars();

        double avgPrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .getAsDouble();

        System.out.println(avgPrice);

    }

    @Test
    public void sum() throws Exception {
        List<Car> cars = MockData.getCars();

        double sumPrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();

        BigDecimal bigDecimalSum = BigDecimal.valueOf(sumPrice);
        System.out.println(bigDecimalSum);
    }

    @Test
    public void statictics() throws Exception {
        List<Car> cars = MockData.getCars();

        DoubleSummaryStatistics statistics = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();

        System.out.println(statistics);
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getCount());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
    }
}

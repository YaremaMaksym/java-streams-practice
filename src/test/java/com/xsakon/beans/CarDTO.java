package com.xsakon.beans;

public class CarDTO {

    private final Integer id;
    private final String make;
    private final String model;
    private final String color;

    public CarDTO(
            Integer id,
            String make,
            String model,
            String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static CarDTO map(Car car){
        return new CarDTO(
                car.getId(),
                car.getMake(),
                car.getModel(),
                car.getColor()
        );
    }
}

package org.projects.contributingrepo.entity;

import lombok.Getter;

public class Car {
    private final int speed;

    @Getter
    private final int model;

    public Car(int speed, int model) {
        this.speed = speed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", model=" + model +
                '}';
    }

}

package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double topSpeed;
    public SportCar(String car_brand, String car_class, double weight, Engine motor, Driver driver, double topSpeed) {
        super(car_brand, car_class, weight, motor, driver);
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}

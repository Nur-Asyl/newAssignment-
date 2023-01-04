package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private double carryingCapacityOfBody;
    public Lorry(String car_brand, String car_class, double weight, Engine motor, Driver driver, double carryingCapacityOfBody) {
        super(car_brand, car_class, weight, motor, driver);
        this.carryingCapacityOfBody = carryingCapacityOfBody;
    }

    public double getCarryingCapacityOfBody() {
        return carryingCapacityOfBody;
    }

    public void setCarryingCapacityOfBody(double carryingCapacityOfBody) {
        this.carryingCapacityOfBody = carryingCapacityOfBody;
    }
}

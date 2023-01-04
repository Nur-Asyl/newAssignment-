package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String car_brand, car_class;
    private double weight;
    private Engine motor;
    private Driver driver;

    public Car(String car_brand, String car_class, double weight, Engine motor, Driver driver) {
        this.car_brand = car_brand;
        this.car_class = car_class;
        this.weight = weight;
        this.motor = motor;
        this.driver = driver;
    }

    public void start() {
        System.out.println("Let's go");
    }
    public void stop(){
        System.out.println("Let's stop");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }

    public String toString(){
        return this.car_brand + " " + this.car_class + " Weight:"
                + this.weight + " \nDriver:" + this.driver.getFullName()
                + " Experience: " + this.driver.getDriving_experience()
                + " \nCar power:" + this.motor.getPower() + " Manufacturer:" + this.motor.getManufacturer();
    }

}

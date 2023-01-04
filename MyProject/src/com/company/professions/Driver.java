package com.company.professions;
import Person.Person;
public class Driver extends Person{
    private String fullName, driving_experience;

    public Driver(String fullName, int age, String driving_experience) {
        super(fullName, age);
        this.driving_experience = driving_experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDriving_experience() {
        return driving_experience;
    }

    public void setDriving_experience(String driving_experience) {
        this.driving_experience = driving_experience;
    }
}

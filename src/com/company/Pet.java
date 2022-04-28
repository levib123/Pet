package com.company;

import java.time.LocalDateTime;

public class Pet {
    String name;
    String breed;
    boolean needsRestraint;
    int day;
    int month;
    int year;
    typeOfAnimal type;
    public enum typeOfAnimal{
        DOG,
        CAT,
        BIRD,
        SNAKE,
        LIZARD,
        MONKEY
    }
    public Pet(String breed, String name, int month, int day, int year, boolean needsRestraint ){
        this.breed = breed;
        this.name = name;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public typeOfAnimal getType() {
        return type;
    }

    public void setType(typeOfAnimal type) {
        this.type = type;
    }

    public Pet(typeOfAnimal animal){
        type = animal;
    }
    public int getAge(){
        LocalDateTime now = LocalDateTime.now();

        return now.getYear() - year;

    }
    public boolean needsRestraint(){
        if(getAge() >= 13){
            return false;
        }
        if(needsRestraint == true && getAge() < 13){
            return true;
        }
        else {
            return true;
        }
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isNeedsRestraint() {
        return needsRestraint;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

package com.example.proje_1;

public class Car {

    // public class hali
    /* public String color;
    public String model;
    public double engine;
    public int doors;

     */

    private String color;
    private String model;
    private double engine;
    private int doors;




    public void setColor(String color) {
        this.color=color;
    }

    public String getColor() {

        return this.color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors == 2|| doors==4 ) {
            this.doors = doors;
        } else {

            System.out.println("Dikkat ! Kapı sayısı 2 veya 4 olabilir.");
        }


    }

    public void setModel(String model) {
        this.model=model;
    }

    public String getModel() {
        return this.model;
    }

    public void start(){
        System.out.println("Araba çalıştı.");
    }

    public void stop() {

        System.out.println("Araba durdu.");
    }


}

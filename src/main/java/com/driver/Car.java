package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name){
        super(name);
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        //Hint: Car extends Vehicle
        this.wheels= this.wheels;
        this.doors= this.doors;
        this.gears= this.gears;
        this.isManual=this.isManual;
        this.type= this.type;
        this.seats= this.seats;
        this.currentGear = 1;
    }
    public Car(String name,boolean isManual){
        super(name);
        this.isManual=isManual;
    }

    public Car(String name, int doors, int gears, int wheels, boolean b, String type) {
        super(name);
        this.wheels= this.wheels;
        this.doors= this.doors;
        this.gears= this.gears;
        this.isManual=this.isManual;
        this.type= this.type;
    }

    public int getWheels(){
        return wheels;
    }

    public int getDoors(){
        return doors;
    }

    public int getGears(){
        return gears;
    }

    public boolean isManual(){
        return isManual;
    }

    public String getType(){
        return type;
    }

    public int getSeats(){
        return seats;
    }

    public int getCurrentGear(){
        return currentGear;
    }


    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}

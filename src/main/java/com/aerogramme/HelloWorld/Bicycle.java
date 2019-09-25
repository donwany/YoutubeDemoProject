package com.aerogramme.HelloWorld;


// base class or parent class
public class Bicycle {

    public int gears;
    public int speed;

    public Bicycle(int gears, int speed) {
        this.gears = gears;
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // speed method
    public int speeding(int acceleration){
        this.speed = this.speed + acceleration;
        return speed;
    }

    // brake method
    public int brake(int acceleration){
        this.speed = this.speed - acceleration;
        return  speed;
    }


    @Override
    public String toString() {
        return "Bicycle[" +
                "gears=" + gears +
                ", speed=" + speed +
                ']';
    }
}

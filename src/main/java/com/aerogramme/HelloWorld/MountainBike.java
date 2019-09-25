package com.aerogramme.HelloWorld;

public class MountainBike extends Bicycle{

    private int seatHeight;

    public MountainBike(int seatHeight, int gear, int speed) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + " \n seatHeight=" + seatHeight + "]";
    }
}

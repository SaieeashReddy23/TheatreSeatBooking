package com.example;

public class Seat {
    private final String seatNumber;
    private boolean reserved=false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean reserve(){
        if(!reserved){
            this.reserved = true;
            System.out.println(seatNumber + " is reserved");
            return true;
        }
        else{
            System.out.println(seatNumber + " is already reserved");
            return false;
        }
    }
    public boolean cancel(){

        if(reserved){
            this.reserved=false;
            System.out.println(seatNumber + " is cancelled");
            return true;
        }
        else{
            System.out.println(seatNumber + " is not yet booked");
            return false;
        }
    }


}

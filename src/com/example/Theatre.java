package com.example;

import java.util.*;

public class Theatre {
    private final String THEATRE_NAME;
    private List<Seat> seatsList = new ArrayList<>();

    public Theatre(String name,int noOfRows,int seatsPerRow) {
        this.THEATRE_NAME = name;

        int lastRow = 'A' + noOfRows - 1;
        for(char row = 'A';row<=lastRow;row++){
            for(int seats=1;seats<seatsPerRow;seats++){
                Seat seat = new Seat(row + String.format("%02d",seats));
                seatsList.add(seat);
            }
        }
    }

    public String getTHEATRE_NAME() {
        return THEATRE_NAME;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int num = Collections.binarySearch(seatsList,requestedSeat,null);
        if(num>=0){
            return seatsList.get(num).reserve();
        }
        else{
            System.out.println("there is no seat " + seatNumber);
            return false;
        }

    }



    public void getSeats(){
        for(Seat seat : seatsList){
            System.out.println(seat.getSeatNumber());
        }
    }


}

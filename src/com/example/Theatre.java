package com.example;

import java.util.ArrayList;
import java.util.List;

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
        Seat requestedSeat = null;
        for(Seat s : seatsList){
            if(s.getSeatNumber().equals(seatNumber)){
                requestedSeat = s;
                break;
            }
        }
        if(requestedSeat==null){
            System.out.println("there is no seat " + seatNumber);
            return false;
        }
        return requestedSeat.reserve();
    }



    public void getSeats(){
        for(Seat seat : seatsList){
            System.out.println(seat.getSeatNumber());
        }
    }


}

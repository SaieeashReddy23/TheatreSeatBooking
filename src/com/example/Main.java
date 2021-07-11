package com.example;

public class Main {
    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Ramesh",25,12);
        System.out.println(theatre.getTHEATRE_NAME());
	    theatre.getSeats();
	    if(theatre.reserveSeat("B06")) {
            System.out.println("please pay");
        }
	    theatre.reserveSeat("B06");

    }
}

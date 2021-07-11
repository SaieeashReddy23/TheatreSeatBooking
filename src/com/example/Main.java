package com.example;

public class Main {
    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Ramesh",25,12);
	    if(theatre.reserveSeat("Y06")) {
            System.out.println("please pay");
        }


    }
}

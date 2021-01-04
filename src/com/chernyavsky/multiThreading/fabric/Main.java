package com.chernyavsky.multiThreading.fabric;


public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Fabric());
        Thread t2 = new Thread(new FirstCrazy());
        Thread t3 = new Thread(new SecondCrazy());
        t1.start();
        t2.start();
        t3.start();

    }
}
